package com.hl95.demo.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;

import com.hl95.demo.entity.Lower;

public interface LowerService {
	
	String  getParameters(HttpServletRequest request);
	
	int saveMsg(Map<String, Object> params);
	
	int updateLowerMsg(Lower lower);
}
