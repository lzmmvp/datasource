package com.doak.springbootMybatisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doak.springbootMybatisdemo.entity.User;
import com.doak.springbootMybatisdemo.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	
	public User selectUser(User user){
		return  userMapper.selectUser(user.getUserName(), user.getPassword());
	}

	public int inserttUser(User user){
		return  userMapper.insert(user);
	}
	public User selectByPrimaryKey(String userName){
		return  userMapper.selectByPrimaryKey(userName);
	}

}
