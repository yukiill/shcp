package com.shcp.dao.mapper;

import com.shcp.pojo.ReTdevicetypeandstatus;
import com.shcp.pojo.ReTdevicetypeandstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReTdevicetypeandstatusMapper {
    int countByExample(ReTdevicetypeandstatusExample example);

    int deleteByExample(ReTdevicetypeandstatusExample example);

    int deleteByPrimaryKey(Long desid);

    int insert(ReTdevicetypeandstatus record);

    int insertSelective(ReTdevicetypeandstatus record);

    List<ReTdevicetypeandstatus> selectByExample(ReTdevicetypeandstatusExample example);

    int updateByExampleSelective(@Param("record") ReTdevicetypeandstatus record, @Param("example") ReTdevicetypeandstatusExample example);

    int updateByExample(@Param("record") ReTdevicetypeandstatus record, @Param("example") ReTdevicetypeandstatusExample example);
}