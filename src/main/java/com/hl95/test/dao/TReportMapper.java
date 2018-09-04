package com.hl95.test.dao;

import com.hl95.test.entity.TReport;
import java.util.List;

public interface TReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TReport record);

    TReport selectByPrimaryKey(Integer id);

    List<TReport> selectAll();

    int updateByPrimaryKey(TReport record);
}