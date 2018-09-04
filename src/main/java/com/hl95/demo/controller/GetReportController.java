package com.hl95.demo.controller;

import java.text.ParseException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hl95.demo.entity.Lower;
import com.hl95.demo.entity.Report;
import com.hl95.demo.service.LowerService;
import com.hl95.demo.service.ReportService;
import com.hl95.demo.utils.GetHeaderParams;

@Controller
public class GetReportController {

	@Autowired
	private ReportService reportService;
	
	@Autowired
	private LowerService lowerService;
	/**
	 * 
	 * @param request
	 * @return 返回状态报告
	 */
	@ResponseBody
	@RequestMapping(value="/getReport",method=RequestMethod.POST)
	public Report getReport(HttpServletRequest request){
		try {
			reportService.saveReport(GetHeaderParams.getHeaderParams(request));
			updateLowerMsg(GetHeaderParams.getHeaderParams(request));
			return  GetHeaderParams.getHeaderParams(request);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 用来更新话单
	 * @param report
	 */
	public void updateLowerMsg(Report report){
		Integer fLinkID = null;
		String FDestAddr = "";
		String freportcode = "";
		if(report!=null){
			fLinkID = report.getFlinkid();
			FDestAddr = report.getFdestaddr();
			freportcode = report.getFreportcode();
		}
		Lower lower = reportService.findLowerByPandId(fLinkID,FDestAddr);
		lower.setType(freportcode);
		lowerService.updateLowerMsg(lower);
	}
}
