package com.doak.springbootMybatisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.doak.springbootMybatisdemo.entity.User;
import com.doak.springbootMybatisdemo.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login")
	public String dologin(){
		return "login";
	}
	@RequestMapping(value="/signup")
	public String dosignup(){
		return "signup";
	}
	
	@RequestMapping(value="/dosignup")
	public String signup(User user , Model model){
		User user1 = userService.selectByPrimaryKey(user.getUserName());
		if(user1==null){
		int i = userService.inserttUser(user);
		if(i==1){
			model.addAttribute("msg", "注册成功！！！");
			return "success";
		}else{
			model.addAttribute("msg", "注册失败！！！");
			return "fail";
		}}
		else{
			
				model.addAttribute("msg", "用户名已存在！！！");
				return "fail";
		}
		
		
		
		
	
	
	
	}
	@RequestMapping(value="/dologin")
	public String login(User user, Model model){
		System.out.println("user:" + user);
		User user1 = userService.selectUser(user) ;
		System.out.println(user1);
		if(user1 == null){
			model.addAttribute("msg", "用户名或者密码错误！！");
			return "fail";
		}else {
			model.addAttribute("msg", "登录成功！！！");
			return "success";
		}
		
	}
	

}
