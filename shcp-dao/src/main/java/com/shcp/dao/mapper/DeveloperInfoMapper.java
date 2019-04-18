package com.shcp.dao.mapper;

import com.shcp.pojo.DeveloperInfo;
import com.shcp.pojo.DeveloperInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeveloperInfoMapper {
    int countByExample(DeveloperInfoExample example);

    int deleteByExample(DeveloperInfoExample example);

    int deleteByPrimaryKey(Long dfid);

    int insert(DeveloperInfo record);

    int insertSelective(DeveloperInfo record);

    List<DeveloperInfo> selectByExample(DeveloperInfoExample example);

    DeveloperInfo selectByPrimaryKey(Long dfid);

    int updateByExampleSelective(@Param("record") DeveloperInfo record, @Param("example") DeveloperInfoExample example);

    int updateByExample(@Param("record") DeveloperInfo record, @Param("example") DeveloperInfoExample example);

    int updateByPrimaryKeySelective(DeveloperInfo record);

    int updateByPrimaryKey(DeveloperInfo record);
}