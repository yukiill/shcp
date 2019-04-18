package com.ice.ssm.mapper;

import com.shcp.pojo.DeviceExamine;
import com.shcp.pojo.DeviceExamineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceExamineMapper {
    int countByExample(DeviceExamineExample example);

    int deleteByExample(DeviceExamineExample example);

    int deleteByPrimaryKey(Long deid);

    int insert(DeviceExamine record);

    int insertSelective(DeviceExamine record);

    List<DeviceExamine> selectByExample(DeviceExamineExample example);

    DeviceExamine selectByPrimaryKey(Long deid);

    int updateByExampleSelective(@Param("record") DeviceExamine record, @Param("example") DeviceExamineExample example);

    int updateByExample(@Param("record") DeviceExamine record, @Param("example") DeviceExamineExample example);

    int updateByPrimaryKeySelective(DeviceExamine record);

    int updateByPrimaryKey(DeviceExamine record);
}