package com.ice.ssm.mapper;

import com.shcp.pojo.DeviceControl;
import com.shcp.pojo.DeviceControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceControlMapper {
    int countByExample(DeviceControlExample example);

    int deleteByExample(DeviceControlExample example);

    int deleteByPrimaryKey(Long decid);

    int insert(DeviceControl record);

    int insertSelective(DeviceControl record);

    List<DeviceControl> selectByExample(DeviceControlExample example);

    DeviceControl selectByPrimaryKey(Long decid);

    int updateByExampleSelective(@Param("record") DeviceControl record, @Param("example") DeviceControlExample example);

    int updateByExample(@Param("record") DeviceControl record, @Param("example") DeviceControlExample example);

    int updateByPrimaryKeySelective(DeviceControl record);

    int updateByPrimaryKey(DeviceControl record);
}