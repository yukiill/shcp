package com.shcp.dao.mapper;

import com.shcp.pojo.TbDevicelimit;
import com.shcp.pojo.TbDevicelimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDevicelimitMapper {
    int countByExample(TbDevicelimitExample example);

    int deleteByExample(TbDevicelimitExample example);

    int deleteByPrimaryKey(Long dslid);

    int insert(TbDevicelimit record);

    int insertSelective(TbDevicelimit record);

    List<TbDevicelimit> selectByExample(TbDevicelimitExample example);

    TbDevicelimit selectByPrimaryKey(Long dslid);

    int updateByExampleSelective(@Param("record") TbDevicelimit record, @Param("example") TbDevicelimitExample example);

    int updateByExample(@Param("record") TbDevicelimit record, @Param("example") TbDevicelimitExample example);

    int updateByPrimaryKeySelective(TbDevicelimit record);

    int updateByPrimaryKey(TbDevicelimit record);
}