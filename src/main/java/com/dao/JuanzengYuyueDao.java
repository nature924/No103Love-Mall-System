package com.dao;

import com.entity.JuanzengYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JuanzengYuyueView;

/**
 * 用户捐赠 Dao 接口
 *
 * @author 
 */
public interface JuanzengYuyueDao extends BaseMapper<JuanzengYuyueEntity> {

   List<JuanzengYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
