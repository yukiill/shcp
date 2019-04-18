package com.ice.ssm.mapper;

import com.shcp.pojo.DeveloperLimitRelationship;
import com.shcp.pojo.DeveloperLimitRelationshipExample;
import com.shcp.pojo.DeveloperLimitRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeveloperLimitRelationshipMapper {
    int countByExample(DeveloperLimitRelationshipExample example);

    int deleteByExample(DeveloperLimitRelationshipExample example);

    int deleteByPrimaryKey(DeveloperLimitRelationshipKey key);

    int insert(DeveloperLimitRelationship record);

    int insertSelective(DeveloperLimitRelationship record);

    List<DeveloperLimitRelationship> selectByExample(DeveloperLimitRelationshipExample example);

    DeveloperLimitRelationship selectByPrimaryKey(DeveloperLimitRelationshipKey key);

    int updateByExampleSelective(@Param("record") DeveloperLimitRelationship record, @Param("example") DeveloperLimitRelationshipExample example);

    int updateByExample(@Param("record") DeveloperLimitRelationship record, @Param("example") DeveloperLimitRelationshipExample example);

    int updateByPrimaryKeySelective(DeveloperLimitRelationship record);

    int updateByPrimaryKey(DeveloperLimitRelationship record);
}