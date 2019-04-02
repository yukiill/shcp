package com.shcp.dao.mapper;

import com.shcp.pojo.ReTdevicetypeandctrl;
import com.shcp.pojo.ReTdevicetypeandctrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReTdevicetypeandctrlMapper {
    int countByExample(ReTdevicetypeandctrlExample example);

    int deleteByExample(ReTdevicetypeandctrlExample example);

    int deleteByPrimaryKey(Long decid);

    int insert(ReTdevicetypeandctrl record);

    int insertSelective(ReTdevicetypeandctrl record);

    List<ReTdevicetypeandctrl> selectByExample(ReTdevicetypeandctrlExample example);

    int updateByExampleSelective(@Param("record") ReTdevicetypeandctrl record, @Param("example") ReTdevicetypeandctrlExample example);

    int updateByExample(@Param("record") ReTdevicetypeandctrl record, @Param("example") ReTdevicetypeandctrlExample example);
}