package com.shcp.dao.mapper;

import com.shcp.pojo.Developer;
import com.shcp.pojo.DeveloperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeveloperMapper {
    int countByExample(DeveloperExample example);

    int deleteByExample(DeveloperExample example);

    int deleteByPrimaryKey(Long did);

    int insert(Developer record);

    int insertSelective(Developer record);

    List<Developer> selectByExample(DeveloperExample example);

    Developer selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") Developer record, @Param("example") DeveloperExample example);

    int updateByExample(@Param("record") Developer record, @Param("example") DeveloperExample example);

    int updateByPrimaryKeySelective(Developer record);

    int updateByPrimaryKey(Developer record);

    String selectByEmail(@Param("email") String email);
}