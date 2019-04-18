package com.ice.ssm.mapper;

import com.shcp.pojo.TestDeviceLimit;
import com.shcp.pojo.TestDeviceLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDeviceLimitMapper {
    int countByExample(TestDeviceLimitExample example);

    int deleteByExample(TestDeviceLimitExample example);

    int deleteByPrimaryKey(Long tdelid);

    int insert(TestDeviceLimit record);

    int insertSelective(TestDeviceLimit record);

    List<TestDeviceLimit> selectByExample(TestDeviceLimitExample example);

    TestDeviceLimit selectByPrimaryKey(Long tdelid);

    int updateByExampleSelective(@Param("record") TestDeviceLimit record, @Param("example") TestDeviceLimitExample example);

    int updateByExample(@Param("record") TestDeviceLimit record, @Param("example") TestDeviceLimitExample example);

    int updateByPrimaryKeySelective(TestDeviceLimit record);

    int updateByPrimaryKey(TestDeviceLimit record);
}