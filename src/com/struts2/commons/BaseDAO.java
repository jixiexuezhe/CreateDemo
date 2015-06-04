package com.struts2.commons;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.struts2.dao.IBaseDao;


public class BaseDAO<T> extends HibernateDaoSupport{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// 实体类类型(由构造方法自动赋值)
	private Class<T> entityClass;
/*	protected String entityClassName = getEntityName(this.entityClass);
	protected String keyFieldName = getKeyFieldName(this.entityClass);*/

	// 构造方法，根据实例类自动获取实体类类型

	public BaseDAO() {  
		this.entityClass = null;
		Class c = getClass();
		Type t = c.getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			Type[] p = ((ParameterizedType) t).getActualTypeArguments();
			this.entityClass = (Class<T>) p[0];
		}
	}

	
	

	 
	public List<T> findByEntity(Object entiey)
	{
		return getHibernateTemplate().findByExample(entiey);
	}

	

	 
	public List<T> findByProperty(String propertyName, Object value)
	{
		/*String queryString = "from " + entityClassName + " o where o." + propertyName + "= ?";
		return super.getHibernateTemplate().find(queryString, value);*/
		return null;
	}

	

	 
	public void delete(Serializable... entityids)
	{
		for (Object id : entityids)
		{
			super.getHibernateTemplate().delete(find((Serializable) id));
		}
	}

	

	 
	@SuppressWarnings("unchecked")
	public T find(Serializable entityId)
	{
		if (null != entityId)
			return (T) super.getHibernateTemplate().get(entityClass, entityId);
		return null;
	}

	

	 
	public int getCount()
	{
		/*String hql = "select count( " + keyFieldName + ") from " + entityClassName;
		int count = Integer.parseInt(super.getHibernateTemplate().find(hql).get(0).toString());
		return count;*/
		return 0;
	}

	public void save(Object entity)
	{
		super.getHibernateTemplate().save(entity);
	}
	 
	public void update(Object entity)
	{
		super.getHibernateTemplate().update(entity);
	}

}
