package com.shcp.dao.mapper;

import com.shcp.pojo.TbDeviceexamine;
import com.shcp.pojo.TbDeviceexamineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDeviceexamineMapper {
    int countByExample(TbDeviceexamineExample example);

    int deleteByExample(TbDeviceexamineExample example);

    int deleteByPrimaryKey(Long dsexid);

    int insert(TbDeviceexamine record);

    int insertSelective(TbDeviceexamine record);

    List<TbDeviceexamine> selectByExample(TbDeviceexamineExample example);

    TbDeviceexamine selectByPrimaryKey(Long dsexid);

    int updateByExampleSelective(@Param("record") TbDeviceexamine record, @Param("example") TbDeviceexamineExample example);

    int updateByExample(@Param("record") TbDeviceexamine record, @Param("example") TbDeviceexamineExample example);

    int updateByPrimaryKeySelective(TbDeviceexamine record);

    int updateByPrimaryKey(TbDeviceexamine record);
}