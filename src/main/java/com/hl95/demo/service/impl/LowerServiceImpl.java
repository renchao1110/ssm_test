package com.hl95.demo.service.impl;

import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import com.hl95.demo.dao.LowerMapper;
import com.hl95.demo.entity.Lower;
import com.hl95.demo.service.LowerService;

@Service
public class LowerServiceImpl implements LowerService {

	@Autowired
	private LowerMapper lowerMapper;
	
	public String getParameters(HttpServletRequest request) {
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = request.getParameter(name);
		}
		return null;
	}

	public int saveMsg(Map<String, Object> params) {
		int i = lowerMapper.saveMsg(params);
		return i;
	}

	public int updateLowerMsg(Lower lower) {
		return lowerMapper.updateByPrimaryKey(lower);
	}

}
