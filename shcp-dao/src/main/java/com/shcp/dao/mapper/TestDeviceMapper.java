package com.ice.ssm.mapper;

import com.shcp.pojo.TestDevice;
import com.shcp.pojo.TestDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDeviceMapper {
    int countByExample(TestDeviceExample example);

    int deleteByExample(TestDeviceExample example);

    int deleteByPrimaryKey(Long tdeid);

    int insert(TestDevice record);

    int insertSelective(TestDevice record);

    List<TestDevice> selectByExample(TestDeviceExample example);

    TestDevice selectByPrimaryKey(Long tdeid);

    int updateByExampleSelective(@Param("record") TestDevice record, @Param("example") TestDeviceExample example);

    int updateByExample(@Param("record") TestDevice record, @Param("example") TestDeviceExample example);

    int updateByPrimaryKeySelective(TestDevice record);

    int updateByPrimaryKey(TestDevice record);
}