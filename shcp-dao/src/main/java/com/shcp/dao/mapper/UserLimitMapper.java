package com.shcp.dao.mapper;

import com.shcp.pojo.UserLimit;
import com.shcp.pojo.UserLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLimitMapper {
    int countByExample(UserLimitExample example);

    int deleteByExample(UserLimitExample example);

    int deleteByPrimaryKey(Short ulid);

    int insert(UserLimit record);

    int insertSelective(UserLimit record);

    List<UserLimit> selectByExample(UserLimitExample example);

    UserLimit selectByPrimaryKey(Short ulid);

    int updateByExampleSelective(@Param("record") UserLimit record, @Param("example") UserLimitExample example);

    int updateByExample(@Param("record") UserLimit record, @Param("example") UserLimitExample example);

    int updateByPrimaryKeySelective(UserLimit record);

    int updateByPrimaryKey(UserLimit record);
}