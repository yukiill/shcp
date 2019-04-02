package com.shcp.dao.mapper;

import com.shcp.pojo.TbReply;
import com.shcp.pojo.TbReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReplyMapper {
    int countByExample(TbReplyExample example);

    int deleteByExample(TbReplyExample example);

    int deleteByPrimaryKey(Long rid);

    int insert(TbReply record);

    int insertSelective(TbReply record);

    List<TbReply> selectByExampleWithBLOBs(TbReplyExample example);

    List<TbReply> selectByExample(TbReplyExample example);

    TbReply selectByPrimaryKey(Long rid);

    int updateByExampleSelective(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByExample(@Param("record") TbReply record, @Param("example") TbReplyExample example);

    int updateByPrimaryKeySelective(TbReply record);

    int updateByPrimaryKeyWithBLOBs(TbReply record);

    int updateByPrimaryKey(TbReply record);
}