package com.hl95.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hl95.demo.service.TestService;

@Controller
@RequestMapping("/hl95")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/demo",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getTestInfo() {
		JSONObject root=new JSONObject();
		testService.getTestInfo(root);
		return root;
		
	}
}
