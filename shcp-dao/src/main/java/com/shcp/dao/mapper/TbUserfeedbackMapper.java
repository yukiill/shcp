package com.shcp.dao.mapper;

import com.shcp.pojo.TbUserfeedback;
import com.shcp.pojo.TbUserfeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserfeedbackMapper {
    int countByExample(TbUserfeedbackExample example);

    int deleteByExample(TbUserfeedbackExample example);

    int deleteByPrimaryKey(Long fid);

    int insert(TbUserfeedback record);

    int insertSelective(TbUserfeedback record);

    List<TbUserfeedback> selectByExampleWithBLOBs(TbUserfeedbackExample example);

    List<TbUserfeedback> selectByExample(TbUserfeedbackExample example);

    TbUserfeedback selectByPrimaryKey(Long fid);

    int updateByExampleSelective(@Param("record") TbUserfeedback record, @Param("example") TbUserfeedbackExample example);

    int updateByExampleWithBLOBs(@Param("record") TbUserfeedback record, @Param("example") TbUserfeedbackExample example);

    int updateByExample(@Param("record") TbUserfeedback record, @Param("example") TbUserfeedbackExample example);

    int updateByPrimaryKeySelective(TbUserfeedback record);

    int updateByPrimaryKeyWithBLOBs(TbUserfeedback record);

    int updateByPrimaryKey(TbUserfeedback record);
}