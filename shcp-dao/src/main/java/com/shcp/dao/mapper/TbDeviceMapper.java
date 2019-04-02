package com.shcp.dao.mapper;

import com.shcp.pojo.TbDevice;
import com.shcp.pojo.TbDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDeviceMapper {
    int countByExample(TbDeviceExample example);

    int deleteByExample(TbDeviceExample example);

    int deleteByPrimaryKey(Long dstid);

    int insert(TbDevice record);

    int insertSelective(TbDevice record);

    List<TbDevice> selectByExample(TbDeviceExample example);

    TbDevice selectByPrimaryKey(Long dstid);

    int updateByExampleSelective(@Param("record") TbDevice record, @Param("example") TbDeviceExample example);

    int updateByExample(@Param("record") TbDevice record, @Param("example") TbDeviceExample example);

    int updateByPrimaryKeySelective(TbDevice record);

    int updateByPrimaryKey(TbDevice record);
}