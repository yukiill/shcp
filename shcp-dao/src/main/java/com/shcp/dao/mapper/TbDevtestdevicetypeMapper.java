package com.shcp.dao.mapper;

import com.shcp.pojo.TbDevtestdevicetype;
import com.shcp.pojo.TbDevtestdevicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDevtestdevicetypeMapper {
    int countByExample(TbDevtestdevicetypeExample example);

    int deleteByExample(TbDevtestdevicetypeExample example);

    int insert(TbDevtestdevicetype record);

    int insertSelective(TbDevtestdevicetype record);

    List<TbDevtestdevicetype> selectByExample(TbDevtestdevicetypeExample example);

    int updateByExampleSelective(@Param("record") TbDevtestdevicetype record, @Param("example") TbDevtestdevicetypeExample example);

    int updateByExample(@Param("record") TbDevtestdevicetype record, @Param("example") TbDevtestdevicetypeExample example);
}