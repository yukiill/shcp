package com.ice.ssm.mapper;

import com.shcp.pojo.TestDeviceStatus;
import com.shcp.pojo.TestDeviceStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDeviceStatusMapper {
    int countByExample(TestDeviceStatusExample example);

    int deleteByExample(TestDeviceStatusExample example);

    int deleteByPrimaryKey(Long tdesid);

    int insert(TestDeviceStatus record);

    int insertSelective(TestDeviceStatus record);

    List<TestDeviceStatus> selectByExample(TestDeviceStatusExample example);

    TestDeviceStatus selectByPrimaryKey(Long tdesid);

    int updateByExampleSelective(@Param("record") TestDeviceStatus record, @Param("example") TestDeviceStatusExample example);

    int updateByExample(@Param("record") TestDeviceStatus record, @Param("example") TestDeviceStatusExample example);

    int updateByPrimaryKeySelective(TestDeviceStatus record);

    int updateByPrimaryKey(TestDeviceStatus record);
}