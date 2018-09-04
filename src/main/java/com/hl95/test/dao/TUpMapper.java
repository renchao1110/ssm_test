package com.hl95.test.dao;

import com.hl95.test.entity.TUp;
import java.util.List;

public interface TUpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUp record);

    TUp selectByPrimaryKey(Integer id);

    List<TUp> selectAll();

    int updateByPrimaryKey(TUp record);
}