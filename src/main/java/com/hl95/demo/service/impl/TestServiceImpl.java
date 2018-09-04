package com.hl95.demo.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hl95.demo.dao.TestDao;
import com.hl95.demo.entity.TestEntity;
import com.hl95.demo.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao testDao;
	
	private final Logger logger=Logger.getLogger(TestServiceImpl.class);
	
	public void getTestInfo(JSONObject root) {
		List<TestEntity> teList = testDao.getTestInfo();
		JSONArray jaItems=new JSONArray();
		if(teList!=null&&teList.size()>0) {
			for(TestEntity teItem:teList) {
				JSONObject jbItem=new JSONObject();
				jbItem.put("account", teItem.getAccount());
				jbItem.put("password", teItem.getPassword());
				jaItems.add(jbItem);
				logger.error("------"+jaItems.toJSONString());
			}
		}
		root.put("testInfo", jaItems);
	}
}
