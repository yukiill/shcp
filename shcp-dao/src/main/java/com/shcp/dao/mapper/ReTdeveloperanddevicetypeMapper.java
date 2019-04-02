package com.shcp.dao.mapper;

import com.shcp.pojo.ReTdeveloperanddevicetype;
import com.shcp.pojo.ReTdeveloperanddevicetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReTdeveloperanddevicetypeMapper {
    int countByExample(ReTdeveloperanddevicetypeExample example);

    int deleteByExample(ReTdeveloperanddevicetypeExample example);

    int deleteByPrimaryKey(Long did);

    int insert(ReTdeveloperanddevicetype record);

    int insertSelective(ReTdeveloperanddevicetype record);

    List<ReTdeveloperanddevicetype> selectByExample(ReTdeveloperanddevicetypeExample example);

    int updateByExampleSelective(@Param("record") ReTdeveloperanddevicetype record, @Param("example") ReTdeveloperanddevicetypeExample example);

    int updateByExample(@Param("record") ReTdeveloperanddevicetype record, @Param("example") ReTdeveloperanddevicetypeExample example);
}