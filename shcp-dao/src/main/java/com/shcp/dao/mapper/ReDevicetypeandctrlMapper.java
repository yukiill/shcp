package com.shcp.dao.mapper;

import com.shcp.pojo.ReDevicetypeandctrlExample;
import com.shcp.pojo.ReDevicetypeandctrlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReDevicetypeandctrlMapper {
    int countByExample(ReDevicetypeandctrlExample example);

    int deleteByExample(ReDevicetypeandctrlExample example);

    int deleteByPrimaryKey(ReDevicetypeandctrlKey key);

    int insert(ReDevicetypeandctrlKey record);

    int insertSelective(ReDevicetypeandctrlKey record);

    List<ReDevicetypeandctrlKey> selectByExample(ReDevicetypeandctrlExample example);

    int updateByExampleSelective(@Param("record") ReDevicetypeandctrlKey record, @Param("example") ReDevicetypeandctrlExample example);

    int updateByExample(@Param("record") ReDevicetypeandctrlKey record, @Param("example") ReDevicetypeandctrlExample example);
}