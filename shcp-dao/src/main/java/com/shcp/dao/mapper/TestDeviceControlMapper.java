package com.ice.ssm.mapper;

import com.shcp.pojo.TestDeviceControl;
import com.shcp.pojo.TestDeviceControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDeviceControlMapper {
    int countByExample(TestDeviceControlExample example);

    int deleteByExample(TestDeviceControlExample example);

    int deleteByPrimaryKey(Long tdecid);

    int insert(TestDeviceControl record);

    int insertSelective(TestDeviceControl record);

    List<TestDeviceControl> selectByExample(TestDeviceControlExample example);

    TestDeviceControl selectByPrimaryKey(Long tdecid);

    int updateByExampleSelective(@Param("record") TestDeviceControl record, @Param("example") TestDeviceControlExample example);

    int updateByExample(@Param("record") TestDeviceControl record, @Param("example") TestDeviceControlExample example);

    int updateByPrimaryKeySelective(TestDeviceControl record);

    int updateByPrimaryKey(TestDeviceControl record);
}