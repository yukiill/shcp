package com.shcp.dao.mapper;

import com.shcp.pojo.TbDevicestatus;
import com.shcp.pojo.TbDevicestatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDevicestatusMapper {
    int countByExample(TbDevicestatusExample example);

    int deleteByExample(TbDevicestatusExample example);

    int deleteByPrimaryKey(Long desid);

    int insert(TbDevicestatus record);

    int insertSelective(TbDevicestatus record);

    List<TbDevicestatus> selectByExample(TbDevicestatusExample example);

    TbDevicestatus selectByPrimaryKey(Long desid);

    int updateByExampleSelective(@Param("record") TbDevicestatus record, @Param("example") TbDevicestatusExample example);

    int updateByExample(@Param("record") TbDevicestatus record, @Param("example") TbDevicestatusExample example);

    int updateByPrimaryKeySelective(TbDevicestatus record);

    int updateByPrimaryKey(TbDevicestatus record);
}