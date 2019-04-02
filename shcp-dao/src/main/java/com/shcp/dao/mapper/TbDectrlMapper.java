package com.shcp.dao.mapper;

import com.shcp.pojo.TbDectrl;
import com.shcp.pojo.TbDectrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDectrlMapper {
    int countByExample(TbDectrlExample example);

    int deleteByExample(TbDectrlExample example);

    int deleteByPrimaryKey(Long decid);

    int insert(TbDectrl record);

    int insertSelective(TbDectrl record);

    List<TbDectrl> selectByExample(TbDectrlExample example);

    TbDectrl selectByPrimaryKey(Long decid);

    int updateByExampleSelective(@Param("record") TbDectrl record, @Param("example") TbDectrlExample example);

    int updateByExample(@Param("record") TbDectrl record, @Param("example") TbDectrlExample example);

    int updateByPrimaryKeySelective(TbDectrl record);

    int updateByPrimaryKey(TbDectrl record);
}