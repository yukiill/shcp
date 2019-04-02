package com.shcp.dao.mapper;

import com.shcp.pojo.ReTdevicetypeanddevicelimit;
import com.shcp.pojo.ReTdevicetypeanddevicelimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReTdevicetypeanddevicelimitMapper {
    int countByExample(ReTdevicetypeanddevicelimitExample example);

    int deleteByExample(ReTdevicetypeanddevicelimitExample example);

    int deleteByPrimaryKey(Long dslid);

    int insert(ReTdevicetypeanddevicelimit record);

    int insertSelective(ReTdevicetypeanddevicelimit record);

    List<ReTdevicetypeanddevicelimit> selectByExample(ReTdevicetypeanddevicelimitExample example);

    int updateByExampleSelective(@Param("record") ReTdevicetypeanddevicelimit record, @Param("example") ReTdevicetypeanddevicelimitExample example);

    int updateByExample(@Param("record") ReTdevicetypeanddevicelimit record, @Param("example") ReTdevicetypeanddevicelimitExample example);
}