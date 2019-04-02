package com.shcp.dao.mapper;

import com.shcp.pojo.Developerinfo;
import com.shcp.pojo.DeveloperinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeveloperinfoMapper {
    int countByExample(DeveloperinfoExample example);

    int deleteByExample(DeveloperinfoExample example);

    int deleteByPrimaryKey(Long dcid);

    int insert(Developerinfo record);

    int insertSelective(Developerinfo record);

    List<Developerinfo> selectByExample(DeveloperinfoExample example);

    Developerinfo selectByPrimaryKey(Long dcid);

    int updateByExampleSelective(@Param("record") Developerinfo record, @Param("example") DeveloperinfoExample example);

    int updateByExample(@Param("record") Developerinfo record, @Param("example") DeveloperinfoExample example);

    int updateByPrimaryKeySelective(Developerinfo record);

    int updateByPrimaryKey(Developerinfo record);
}