package com.struts2.service;

import java.util.List;

import com.struts2.model.User;

public interface IUserService {

	public List<User> findAll();
	
	public List<User> loadAll();
	
	public User getById(Integer id);
}
