package com.hl95.demo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import com.hl95.demo.entity.Report;

public class GetHeaderParams {
	
	public static Report getHeaderParams(HttpServletRequest request) throws ParseException{
		Report report = new Report();
		String platform = request.getHeader("platform");
		String funikey = request.getHeader("funikey");
		String forgaddr = request.getHeader("forgaddr");
		String fdestaddr = request.getHeader("fdestaddr");
		String fsubmittime = request.getHeader("fsubmittime");
		String ffeeterminal = request.getHeader("ffeeterminal");
		String fserviceupid = request.getHeader("fserviceupid");
		String freportcode = request.getHeader("freportcode");
		String flinkid = request.getHeader("flinkid");
		String fackstatus = request.getHeader("fackstatus");
		report.setFackstatus(fackstatus);
		report.setFdestaddr(fdestaddr);
		report.setFfeeterminal(ffeeterminal);
		report.setFlinkid(Integer.valueOf(flinkid));
		report.setForgaddr(forgaddr);
		report.setFreportcode(freportcode);
		report.setFserviceupid(Integer.valueOf(fserviceupid));
		report.setFsubmittime(fsubmittime);
		report.setFunikey(funikey);
		report.setPlatform(platform);
		return report;
	}
}
