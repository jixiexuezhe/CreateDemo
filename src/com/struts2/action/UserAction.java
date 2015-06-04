package com.struts2.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.struts2.commons.BaseAction;
import com.struts2.model.User;
import com.struts2.service.IUserService;

public class UserAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	@Autowired
	private IUserService userService ;
	
	public String execute(){
		List<User> userList = userService.findAll();
		for (User user : userList) {
			System.out.println(user.getName());
		}
	//	User user = userService.getById(2);
		request.setAttribute("userList", userList);
		return "initialize";
	}
}
