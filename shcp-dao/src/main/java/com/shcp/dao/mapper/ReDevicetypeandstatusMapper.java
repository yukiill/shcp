package com.shcp.dao.mapper;

import com.shcp.pojo.ReDevicetypeandstatusExample;
import com.shcp.pojo.ReDevicetypeandstatusKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReDevicetypeandstatusMapper {
    int countByExample(ReDevicetypeandstatusExample example);

    int deleteByExample(ReDevicetypeandstatusExample example);

    int deleteByPrimaryKey(ReDevicetypeandstatusKey key);

    int insert(ReDevicetypeandstatusKey record);

    int insertSelective(ReDevicetypeandstatusKey record);

    List<ReDevicetypeandstatusKey> selectByExample(ReDevicetypeandstatusExample example);

    int updateByExampleSelective(@Param("record") ReDevicetypeandstatusKey record, @Param("example") ReDevicetypeandstatusExample example);

    int updateByExample(@Param("record") ReDevicetypeandstatusKey record, @Param("example") ReDevicetypeandstatusExample example);
}