package com.struts2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.struts2.dao.IUserDao;
import com.struts2.dao.impl.UserDaoImpl;
import com.struts2.model.User;
import com.struts2.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
 
	@Autowired
	private UserDaoImpl userDao;

	
	/*public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}*/




	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		users = userDao.getAll();
		return users;
	}

	


	public List<User> loadAll() {
		/*List<User> users = new ArrayList<User>();
		users = userDao.loadAll();
		return users;*/
		return  null;
	}




	public User getById(Integer id) {
		return userDao.getById(id);
	}
}
