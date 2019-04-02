package com.shcp.dao.mapper;

import com.shcp.pojo.TbDevicetype;
import com.shcp.pojo.TbDevicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDevicetypeMapper {
    int countByExample(TbDevicetypeExample example);

    int deleteByExample(TbDevicetypeExample example);

    int deleteByPrimaryKey(Long tid);

    int insert(TbDevicetype record);

    int insertSelective(TbDevicetype record);

    List<TbDevicetype> selectByExample(TbDevicetypeExample example);

    TbDevicetype selectByPrimaryKey(Long tid);

    int updateByExampleSelective(@Param("record") TbDevicetype record, @Param("example") TbDevicetypeExample example);

    int updateByExample(@Param("record") TbDevicetype record, @Param("example") TbDevicetypeExample example);

    int updateByPrimaryKeySelective(TbDevicetype record);

    int updateByPrimaryKey(TbDevicetype record);
}