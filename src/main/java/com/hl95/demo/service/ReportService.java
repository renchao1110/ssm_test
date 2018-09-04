package com.hl95.demo.service;

import com.hl95.demo.entity.Lower;
import com.hl95.demo.entity.Report;

public interface ReportService {
	int saveReport(Report report);
	
	Lower findLowerByPandId(Integer fLinkID,String FDestAddr);
}
