package com.ssm.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.test.dao.IUserDao;
import com.ssm.test.entity.User;
import com.ssm.test.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userDao;
	
	public List<User> selectAllUser(){
		return userDao.selectAllUser();
	}
}
