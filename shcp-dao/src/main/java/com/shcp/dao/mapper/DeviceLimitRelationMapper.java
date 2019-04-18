package com.shcp.dao.mapper;

import com.shcp.pojo.DeviceLimitRelation;
import com.shcp.pojo.DeviceLimitRelationExample;
import com.shcp.pojo.DeviceLimitRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceLimitRelationMapper {
    int countByExample(DeviceLimitRelationExample example);

    int deleteByExample(DeviceLimitRelationExample example);

    int deleteByPrimaryKey(DeviceLimitRelationKey key);

    int insert(DeviceLimitRelation record);

    int insertSelective(DeviceLimitRelation record);

    List<DeviceLimitRelation> selectByExample(DeviceLimitRelationExample example);

    DeviceLimitRelation selectByPrimaryKey(DeviceLimitRelationKey key);

    int updateByExampleSelective(@Param("record") DeviceLimitRelation record, @Param("example") DeviceLimitRelationExample example);

    int updateByExample(@Param("record") DeviceLimitRelation record, @Param("example") DeviceLimitRelationExample example);

    int updateByPrimaryKeySelective(DeviceLimitRelation record);

    int updateByPrimaryKey(DeviceLimitRelation record);
}