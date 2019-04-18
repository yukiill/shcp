package com.shcp.dao.mapper;

import com.shcp.pojo.DeviceLimit;
import com.shcp.pojo.DeviceLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceLimitMapper {
    int countByExample(DeviceLimitExample example);

    int deleteByExample(DeviceLimitExample example);

    int deleteByPrimaryKey(Long delid);

    int insert(DeviceLimit record);

    int insertSelective(DeviceLimit record);

    List<DeviceLimit> selectByExample(DeviceLimitExample example);

    DeviceLimit selectByPrimaryKey(Long delid);

    int updateByExampleSelective(@Param("record") DeviceLimit record, @Param("example") DeviceLimitExample example);

    int updateByExample(@Param("record") DeviceLimit record, @Param("example") DeviceLimitExample example);

    int updateByPrimaryKeySelective(DeviceLimit record);

    int updateByPrimaryKey(DeviceLimit record);
}