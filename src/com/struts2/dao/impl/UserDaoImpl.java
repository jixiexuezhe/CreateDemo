package com.struts2.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.struts2.commons.BaseDAO;
import com.struts2.model.User;

@Repository("userDao") 
public class UserDaoImpl extends BaseDAO<User>{
//	private HibernateTemplate hibernateTemplate;  
	/*@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.template = new HibernateTemplate(sessionFactory); 
	}*/

	public List<User> getAll(){
		String hql = "from User";	
		return getHibernateTemplate().find(hql);
	}
	
	public User getById(Integer id){
		return (User) getHibernateTemplate().get(User.class, id);
	}
	
	/*@Override
	public Object get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}*/
}
