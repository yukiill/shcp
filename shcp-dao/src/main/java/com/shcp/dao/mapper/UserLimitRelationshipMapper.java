package com.ice.ssm.mapper;

import com.shcp.pojo.UserLimitRelationship;
import com.shcp.pojo.UserLimitRelationshipExample;
import com.shcp.pojo.UserLimitRelationshipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLimitRelationshipMapper {
    int countByExample(UserLimitRelationshipExample example);

    int deleteByExample(UserLimitRelationshipExample example);

    int deleteByPrimaryKey(UserLimitRelationshipKey key);

    int insert(UserLimitRelationship record);

    int insertSelective(UserLimitRelationship record);

    List<UserLimitRelationship> selectByExample(UserLimitRelationshipExample example);

    UserLimitRelationship selectByPrimaryKey(UserLimitRelationshipKey key);

    int updateByExampleSelective(@Param("record") UserLimitRelationship record, @Param("example") UserLimitRelationshipExample example);

    int updateByExample(@Param("record") UserLimitRelationship record, @Param("example") UserLimitRelationshipExample example);

    int updateByPrimaryKeySelective(UserLimitRelationship record);

    int updateByPrimaryKey(UserLimitRelationship record);
}