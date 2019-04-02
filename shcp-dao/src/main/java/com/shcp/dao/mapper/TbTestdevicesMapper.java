package com.shcp.dao.mapper;

import com.shcp.pojo.TbTestdevices;
import com.shcp.pojo.TbTestdevicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTestdevicesMapper {
    int countByExample(TbTestdevicesExample example);

    int deleteByExample(TbTestdevicesExample example);

    int insert(TbTestdevices record);

    int insertSelective(TbTestdevices record);

    List<TbTestdevices> selectByExample(TbTestdevicesExample example);

    int updateByExampleSelective(@Param("record") TbTestdevices record, @Param("example") TbTestdevicesExample example);

    int updateByExample(@Param("record") TbTestdevices record, @Param("example") TbTestdevicesExample example);
}