package com.struts2.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.struts2.dao.impl.UserDaoImpl;
import com.struts2.model.User;
 
public class UserTest extends DaseTest {
	@Autowired 
	private UserDaoImpl userDao;

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}
	
/*	@Before  
    public void init() {  
    } 
	*/
	@Test
	public void findUserTest(){
		List<User> userList = userDao.getAll();
		for (User user : userList) {
			System.out.println(user.getName()+"*********");
		}
	}
	
	@Test
	public void saveUser(){
		User user = new User();
		user.setLastIp("192.168.1.1");
		user.setLastVisit(new Date());
		user.setName("test");
		userDao.save(user);
	}
}
