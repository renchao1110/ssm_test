package com.hl95.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hl95.demo.dao.LowerMapper;
import com.hl95.demo.dao.ReportMapper;
import com.hl95.demo.entity.Lower;
import com.hl95.demo.entity.Report;
import com.hl95.demo.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;
	@Autowired
	private LowerMapper lowerMapper;
	public int saveReport(Report report) {
		return reportMapper.insert(report);
	}
	public Lower findLowerByPandId(Integer fLinkID,String FDestAddr) {
		return lowerMapper.findLowerByReport(fLinkID,FDestAddr);
	}

}
