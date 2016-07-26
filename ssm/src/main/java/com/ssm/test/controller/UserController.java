package com.ssm.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.test.entity.User;
import com.ssm.test.service.IUserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/showAllUser")
	public String showAllUser(HttpServletRequest request,ModelMap map){
		List<User> userList = userService.selectAllUser();
		map.put("userList", userList);
		return "User/userlist";
    }
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request,ModelMap map,String userName,String password){
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(password);
		userService.insert(user);
		return "redirect:showAllUser.do";
    }
}
