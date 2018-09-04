package com.hl95.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hl95.demo.dao.UserMapper;
import com.hl95.demo.entity.User;
import com.hl95.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	public User getUserByIp(String ip) {
		
		return userMapper.selectByIp(ip);
	}

}
