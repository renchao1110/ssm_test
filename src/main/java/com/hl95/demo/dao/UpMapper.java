package com.hl95.demo.dao;

import com.hl95.demo.entity.Up;
import com.hl95.demo.entity.UpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpMapper {
    long countByExample(UpExample example);

    int deleteByExample(UpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Up record);

    int insertSelective(Up record);

    List<Up> selectByExample(UpExample example);

    Up selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Up record, @Param("example") UpExample example);

    int updateByExample(@Param("record") Up record, @Param("example") UpExample example);

    int updateByPrimaryKeySelective(Up record);

    int updateByPrimaryKey(Up record);
}