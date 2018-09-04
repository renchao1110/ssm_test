package com.hl95.demo.dao;

import com.hl95.demo.entity.Report;
import com.hl95.demo.entity.ReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportMapper {
    long countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);
}