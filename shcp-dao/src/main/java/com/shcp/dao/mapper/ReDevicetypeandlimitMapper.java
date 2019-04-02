package com.shcp.dao.mapper;

import com.shcp.pojo.ReDevicetypeandlimitExample;
import com.shcp.pojo.ReDevicetypeandlimitKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReDevicetypeandlimitMapper {
    int countByExample(ReDevicetypeandlimitExample example);

    int deleteByExample(ReDevicetypeandlimitExample example);

    int deleteByPrimaryKey(ReDevicetypeandlimitKey key);

    int insert(ReDevicetypeandlimitKey record);

    int insertSelective(ReDevicetypeandlimitKey record);

    List<ReDevicetypeandlimitKey> selectByExample(ReDevicetypeandlimitExample example);

    int updateByExampleSelective(@Param("record") ReDevicetypeandlimitKey record, @Param("example") ReDevicetypeandlimitExample example);

    int updateByExample(@Param("record") ReDevicetypeandlimitKey record, @Param("example") ReDevicetypeandlimitExample example);
}