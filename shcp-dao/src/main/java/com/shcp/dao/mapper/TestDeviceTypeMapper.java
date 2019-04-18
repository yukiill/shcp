package com.ice.ssm.mapper;

import com.shcp.pojo.TestDeviceType;
import com.shcp.pojo.TestDeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDeviceTypeMapper {
    int countByExample(TestDeviceTypeExample example);

    int deleteByExample(TestDeviceTypeExample example);

    int deleteByPrimaryKey(Long tdsid);

    int insert(TestDeviceType record);

    int insertSelective(TestDeviceType record);

    List<TestDeviceType> selectByExample(TestDeviceTypeExample example);

    TestDeviceType selectByPrimaryKey(Long tdsid);

    int updateByExampleSelective(@Param("record") TestDeviceType record, @Param("example") TestDeviceTypeExample example);

    int updateByExample(@Param("record") TestDeviceType record, @Param("example") TestDeviceTypeExample example);

    int updateByPrimaryKeySelective(TestDeviceType record);

    int updateByPrimaryKey(TestDeviceType record);
}