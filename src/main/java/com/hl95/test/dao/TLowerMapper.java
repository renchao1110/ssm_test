package com.hl95.test.dao;

import com.hl95.test.entity.TLower;
import java.util.List;

public interface TLowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TLower record);

    TLower selectByPrimaryKey(Integer id);

    List<TLower> selectAll();

    int updateByPrimaryKey(TLower record);
}