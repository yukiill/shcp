package com.shcp.dao.mapper;

import com.shcp.pojo.DeviceStatus;
import com.shcp.pojo.DeviceStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceStatusMapper {
    int countByExample(DeviceStatusExample example);

    int deleteByExample(DeviceStatusExample example);

    int deleteByPrimaryKey(Long desid);

    int insert(DeviceStatus record);

    int insertSelective(DeviceStatus record);

    List<DeviceStatus> selectByExample(DeviceStatusExample example);

    DeviceStatus selectByPrimaryKey(Long desid);

    int updateByExampleSelective(@Param("record") DeviceStatus record, @Param("example") DeviceStatusExample example);

    int updateByExample(@Param("record") DeviceStatus record, @Param("example") DeviceStatusExample example);

    int updateByPrimaryKeySelective(DeviceStatus record);

    int updateByPrimaryKey(DeviceStatus record);
}