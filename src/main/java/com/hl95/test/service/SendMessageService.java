package com.hl95.test.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hl95.test.utils.enums.MessageEnums;

public interface SendMessageService {
	MessageEnums sendMsg(HttpServletRequest request);
}
