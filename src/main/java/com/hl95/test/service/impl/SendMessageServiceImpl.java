package com.hl95.test.service.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hl95.demo.dao.LowerMapper;
import com.hl95.demo.entity.User;
import com.hl95.demo.service.UserService;
import com.hl95.demo.utils.SendMsg;
import com.hl95.test.service.SendMessageService;
import com.hl95.test.utils.ParamsValidate;
import com.hl95.test.utils.StringUtils;
import com.hl95.test.utils.enums.MessageEnums;
@Service
public class SendMessageServiceImpl implements SendMessageService {

	private Logger logger = Logger.getLogger(SendMessageServiceImpl.class);
	@Autowired
	private LowerMapper lowerMapper;
	@Autowired
	private UserService userService;
	private static final String url = "http://q.hl95.com:8061";
	public MessageEnums sendMsg(HttpServletRequest request) {
		//1.获取请求参数
		Map<String, Object> params = ParamsValidate.getParams(request);
		//2.校验请求参数是否合法
		MessageEnums messageEnums = ParamsValidate.validateParams(params);
		if(!MessageEnums.MessageEnums_08.getValue().equals(messageEnums.getValue())){
			logger.error(params);
			return messageEnums;
		}
		
		//2、IP鉴权
		String remoteHost = StringUtils.toString(params.get("remoteHost"));
		
		User user = userService.getUserByIp(remoteHost);
		if(user==null) {
			logger.error("ERR IP:"+remoteHost);
			return MessageEnums.MessageEnums_02;
		}
		
		String state = SendMsg.sendPost(url,params);
		params.put("state", state);
		
		int saveMsg = lowerMapper.saveMsg(params);
		logger.info("saveMsg================"+saveMsg);
		if("00".equals(state)){
			return MessageEnums.MessageEnums_00;
		}
		return MessageEnums.MessageEnums_04;
	}

}
