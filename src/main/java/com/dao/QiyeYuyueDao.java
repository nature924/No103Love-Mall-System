package com.dao;

import com.entity.QiyeYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyeYuyueView;

/**
 * 公益企业捐赠 Dao 接口
 *
 * @author 
 */
public interface QiyeYuyueDao extends BaseMapper<QiyeYuyueEntity> {

   List<QiyeYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
