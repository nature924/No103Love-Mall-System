
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 公益企业捐赠
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/qiyeYuyue")
public class QiyeYuyueController {
    private static final Logger logger = LoggerFactory.getLogger(QiyeYuyueController.class);

    private static final String TABLE_NAME = "qiyeYuyue";

    @Autowired
    private QiyeYuyueService qiyeYuyueService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private AddressService addressService;//收货地址
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private JuanzengYuyueService juanzengYuyueService;//用户捐赠
    @Autowired
    private QiyeService qiyeService;//企业
    @Autowired
    private ShangpinService shangpinService;//商品
    @Autowired
    private ShangpinCollectionService shangpinCollectionService;//商品收藏
    @Autowired
    private ShangpinCommentbackService shangpinCommentbackService;//商品评价
    @Autowired
    private ShangpinOrderService shangpinOrderService;//商品订单
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("企业".equals(role))
            params.put("qiyeId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = qiyeYuyueService.queryPage(params);

        //字典表数据转换
        List<QiyeYuyueView> list =(List<QiyeYuyueView>)page.getList();
        for(QiyeYuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QiyeYuyueEntity qiyeYuyue = qiyeYuyueService.selectById(id);
        if(qiyeYuyue !=null){
            //entity转view
            QiyeYuyueView view = new QiyeYuyueView();
            BeanUtils.copyProperties( qiyeYuyue , view );//把实体数据重构到view中
            //级联表 企业
            //级联表
            QiyeEntity qiye = qiyeService.selectById(qiyeYuyue.getQiyeId());
            if(qiye != null){
            BeanUtils.copyProperties( qiye , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "qiyeId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setQiyeId(qiye.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody QiyeYuyueEntity qiyeYuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,qiyeYuyue:{}",this.getClass().getName(),qiyeYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("企业".equals(role))
            qiyeYuyue.setQiyeId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<QiyeYuyueEntity> queryWrapper = new EntityWrapper<QiyeYuyueEntity>()
            .eq("qiye_id", qiyeYuyue.getQiyeId())
            .in("qiye_yuyue_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiyeYuyueEntity qiyeYuyueEntity = qiyeYuyueService.selectOne(queryWrapper);
        if(qiyeYuyueEntity==null){
            qiyeYuyue.setQiyeYuyueYesnoTypes(1);
            qiyeYuyue.setInsertTime(new Date());
            qiyeYuyue.setCreateTime(new Date());
            qiyeYuyueService.insert(qiyeYuyue);
            return R.ok();
        }else {
            if(qiyeYuyueEntity.getQiyeYuyueYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(qiyeYuyueEntity.getQiyeYuyueYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QiyeYuyueEntity qiyeYuyue, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,qiyeYuyue:{}",this.getClass().getName(),qiyeYuyue.toString());
        QiyeYuyueEntity oldQiyeYuyueEntity = qiyeYuyueService.selectById(qiyeYuyue.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("企业".equals(role))
//            qiyeYuyue.setQiyeId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(qiyeYuyue.getQiyeYuyuePhoto()) || "null".equals(qiyeYuyue.getQiyeYuyuePhoto())){
                qiyeYuyue.setQiyeYuyuePhoto(null);
        }

            qiyeYuyueService.updateById(qiyeYuyue);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody QiyeYuyueEntity qiyeYuyueEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,qiyeYuyueEntity:{}",this.getClass().getName(),qiyeYuyueEntity.toString());

        QiyeYuyueEntity oldQiyeYuyue = qiyeYuyueService.selectById(qiyeYuyueEntity.getId());//查询原先数据

//        if(qiyeYuyueEntity.getQiyeYuyueYesnoTypes() == 2){//通过
//            qiyeYuyueEntity.setQiyeYuyueTypes();
//        }else if(qiyeYuyueEntity.getQiyeYuyueYesnoTypes() == 3){//拒绝
//            qiyeYuyueEntity.setQiyeYuyueTypes();
//        }
        qiyeYuyueEntity.setQiyeYuyueShenheTime(new Date());//审核时间
        qiyeYuyueService.updateById(qiyeYuyueEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<QiyeYuyueEntity> oldQiyeYuyueList =qiyeYuyueService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        qiyeYuyueService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<QiyeYuyueEntity> qiyeYuyueList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            QiyeYuyueEntity qiyeYuyueEntity = new QiyeYuyueEntity();
//                            qiyeYuyueEntity.setQiyeYuyueUuidNumber(data.get(0));                    //报名编号 要改的
//                            qiyeYuyueEntity.setQiyeId(Integer.valueOf(data.get(0)));   //公益企业 要改的
//                            qiyeYuyueEntity.setQiyeYuyueText(data.get(0));                    //报名理由 要改的
//                            qiyeYuyueEntity.setQiyeYuyuePhoto("");//详情和图片
//                            qiyeYuyueEntity.setQiyeYuyueYesnoTypes(Integer.valueOf(data.get(0)));   //报名状态 要改的
//                            qiyeYuyueEntity.setQiyeYuyueYesnoText(data.get(0));                    //审核回复 要改的
//                            qiyeYuyueEntity.setQiyeYuyueShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            qiyeYuyueEntity.setInsertTime(date);//时间
//                            qiyeYuyueEntity.setCreateTime(date);//时间
                            qiyeYuyueList.add(qiyeYuyueEntity);


                            //把要查询是否重复的字段放入map中
                                //报名编号
                                if(seachFields.containsKey("qiyeYuyueUuidNumber")){
                                    List<String> qiyeYuyueUuidNumber = seachFields.get("qiyeYuyueUuidNumber");
                                    qiyeYuyueUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> qiyeYuyueUuidNumber = new ArrayList<>();
                                    qiyeYuyueUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("qiyeYuyueUuidNumber",qiyeYuyueUuidNumber);
                                }
                        }

                        //查询是否重复
                         //报名编号
                        List<QiyeYuyueEntity> qiyeYuyueEntities_qiyeYuyueUuidNumber = qiyeYuyueService.selectList(new EntityWrapper<QiyeYuyueEntity>().in("qiye_yuyue_uuid_number", seachFields.get("qiyeYuyueUuidNumber")));
                        if(qiyeYuyueEntities_qiyeYuyueUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(QiyeYuyueEntity s:qiyeYuyueEntities_qiyeYuyueUuidNumber){
                                repeatFields.add(s.getQiyeYuyueUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [报名编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        qiyeYuyueService.insertBatch(qiyeYuyueList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = qiyeYuyueService.queryPage(params);

        //字典表数据转换
        List<QiyeYuyueView> list =(List<QiyeYuyueView>)page.getList();
        for(QiyeYuyueView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QiyeYuyueEntity qiyeYuyue = qiyeYuyueService.selectById(id);
            if(qiyeYuyue !=null){


                //entity转view
                QiyeYuyueView view = new QiyeYuyueView();
                BeanUtils.copyProperties( qiyeYuyue , view );//把实体数据重构到view中

                //级联表
                    QiyeEntity qiye = qiyeService.selectById(qiyeYuyue.getQiyeId());
                if(qiye != null){
                    BeanUtils.copyProperties( qiye , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setQiyeId(qiye.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody QiyeYuyueEntity qiyeYuyue, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,qiyeYuyue:{}",this.getClass().getName(),qiyeYuyue.toString());
        Wrapper<QiyeYuyueEntity> queryWrapper = new EntityWrapper<QiyeYuyueEntity>()
            .eq("qiye_yuyue_uuid_number", qiyeYuyue.getQiyeYuyueUuidNumber())
            .eq("qiye_id", qiyeYuyue.getQiyeId())
            .eq("qiye_yuyue_text", qiyeYuyue.getQiyeYuyueText())
            .in("qiye_yuyue_yesno_types", new Integer[]{1,2})
            .eq("qiye_yuyue_yesno_text", qiyeYuyue.getQiyeYuyueYesnoText())
//            .notIn("qiye_yuyue_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QiyeYuyueEntity qiyeYuyueEntity = qiyeYuyueService.selectOne(queryWrapper);
        if(qiyeYuyueEntity==null){
            qiyeYuyue.setQiyeYuyueYesnoTypes(1);
            qiyeYuyue.setInsertTime(new Date());
            qiyeYuyue.setCreateTime(new Date());
        qiyeYuyueService.insert(qiyeYuyue);

            return R.ok();
        }else {
            if(qiyeYuyueEntity.getQiyeYuyueYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(qiyeYuyueEntity.getQiyeYuyueYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

}

