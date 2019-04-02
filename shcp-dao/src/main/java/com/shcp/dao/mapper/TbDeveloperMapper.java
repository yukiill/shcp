package com.shcp.dao.mapper;

import com.shcp.pojo.TbDeveloper;
import com.shcp.pojo.TbDeveloperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDeveloperMapper {
    int countByExample(TbDeveloperExample example);

    int deleteByExample(TbDeveloperExample example);

    int deleteByPrimaryKey(Long did);

    int insert(TbDeveloper record);

    int insertSelective(TbDeveloper record);

    List<TbDeveloper> selectByExample(TbDeveloperExample example);

    TbDeveloper selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") TbDeveloper record, @Param("example") TbDeveloperExample example);

    int updateByExample(@Param("record") TbDeveloper record, @Param("example") TbDeveloperExample example);

    int updateByPrimaryKeySelective(TbDeveloper record);

    int updateByPrimaryKey(TbDeveloper record);
}