package com.shcp.dao.mapper;

import com.shcp.pojo.TbUserlimit;
import com.shcp.pojo.TbUserlimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserlimitMapper {
    int countByExample(TbUserlimitExample example);

    int deleteByExample(TbUserlimitExample example);

    int deleteByPrimaryKey(Short lid);

    int insert(TbUserlimit record);

    int insertSelective(TbUserlimit record);

    List<TbUserlimit> selectByExample(TbUserlimitExample example);

    TbUserlimit selectByPrimaryKey(Short lid);

    int updateByExampleSelective(@Param("record") TbUserlimit record, @Param("example") TbUserlimitExample example);

    int updateByExample(@Param("record") TbUserlimit record, @Param("example") TbUserlimitExample example);

    int updateByPrimaryKeySelective(TbUserlimit record);

    int updateByPrimaryKey(TbUserlimit record);
}