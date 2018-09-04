package com.hl95.test.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hl95.test.entity.ResponEntity;
import com.hl95.test.service.SendMessageService;
import com.hl95.test.service.impl.SendMessageServiceImpl;
import com.hl95.test.utils.ParamsValidate;
import com.hl95.test.utils.enums.MessageEnums;

@Controller
public class SendMsgController {
	
	@Autowired
	private SendMessageService sendMsgService;
	@RequestMapping(value="/sendMsg",method=RequestMethod.POST)
	@ResponseBody
	public ResponEntity sendMsg(HttpServletRequest request){
		MessageEnums messageEnums = sendMsgService.sendMsg(request);
		return ResponEntity.getResponEnums(messageEnums);
	}
}
