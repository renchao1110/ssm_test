package com.hl95.demo.dao;

import com.hl95.demo.entity.Lower;
import com.hl95.demo.entity.LowerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LowerMapper {
    long countByExample(LowerExample example);

    int deleteByExample(LowerExample example);

    int deleteByPrimaryKey(Integer epid);

    int insert(Lower record);

    int insertSelective(Lower record);

    List<Lower> selectByExample(LowerExample example);

    Lower selectByPrimaryKey(Integer epid);

    int updateByExampleSelective(@Param("record") Lower record, @Param("example") LowerExample example);

    int updateByExample(@Param("record") Lower record, @Param("example") LowerExample example);

    int updateByPrimaryKeySelective(Lower record);

    int updateByPrimaryKey(Lower record);
    
    int saveMsg(Map<String, Object> params);
    
    Lower findLowerByReport(@Param("fLinkID")Integer fLinkID,@Param("FDestAddr")String FDestAddr);
}