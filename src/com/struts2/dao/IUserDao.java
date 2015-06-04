package com.struts2.dao;

import java.util.List;

import com.struts2.model.User;

public interface IUserDao{
	List<User> getAll();
}
