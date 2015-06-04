package com.struts2.dao;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;


public interface IBaseDao<T> {
	/**
	 * �������Բ��Ҷ���
	 * 
	 * @param propertyName
	 *            ���ԣ���ӦBean��
	 * @param value
	 *            ����
	 * @return �������Բ��Ҷ���
	 */
	public List<T> findByProperty(String propertyName, Object value);

	/**
	 * ����ʵ����Ҷ���
	 * 
	 * @param entiey
	 *            ʵ�壨T���ͣ�
	 * @return �������Բ��Ҷ���
	 */
	public List<T> findByEntity(Object entiey);

	/**
	 * ��ȡ��¼����
	 * 
	 * @param entityClass
	 *            ʵ����
	 * @return
	 */
	public int getCount();

	/**
	 * ����ʵ��
	 * 
	 * @param entity
	 *            ʵ��id
	 */
	public void save(Object entity);

	/**
	 * ����ʵ��
	 * 
	 * @param entity
	 *            ʵ��id
	 */
	public void update(Object entity);

	/**
	 * ɾ��ʵ��
	 * 
	 * @param entityClass
	 *            ʵ����
	 * @param entityids
	 *            ʵ��id����
	 */
	public void delete(Serializable... entityids);

	/**
	 * ��ȡʵ��
	 * 
	 * @param <T>
	 * @param entityClass
	 *            ʵ����
	 * @param entityId
	 *            ʵ��id
	 * @return
	 */
	public T find(Serializable entityId);

	/**
	 * ��ȡ��ҳ����
	 * @param firstindex ��ʼ����
	 * @param maxresult ÿҳ��ʾ��¼��
	 * @param wherejpql where���
	 * @param queryParams ��ѯ����
	 * @param orderby ��������
	 * @return ��ҳ����
	 */
	//public QueryResult<T> getScrollData(final int firstindex, final int maxresult, final String wherejpql, final Object[] queryParams,
		//	final LinkedHashMap<String, String> orderby);

	/**
	 * ��ȡ��ҳ����
	 * @param firstindex ��ʼ����
	 * @param maxresult ÿҳ��ʾ��¼��
	 * @param wherejpql where���
	 * @param queryParams ��ѯ����
	 * @return ��ҳ����
	 */
	//public QueryResult<T> getScrollData(final int firstindex, final int maxresult, final String wherejpql, final Object[] queryParams);

	/**
	 * ��ȡ��ҳ����
	 * @param firstindex ��ʼ����
	 * @param maxresult ÿҳ��ʾ��¼��
	 * @param orderby ��������
	 * @return ��ҳ����
	 */
	//public QueryResult<T> getScrollData(final int firstindex, final int maxresult, final LinkedHashMap<String, String> orderby);

	/**
	 * ��ȡ��ҳ����
	 * @param firstindex ��ʼ����
	 * @param maxresult ÿҳ��ʾ��¼��
	 * @return ��ҳ����
	 */
	//public QueryResult<T> getScrollData(final int firstindex, final int maxresult);

	/**
	 * ��ȡ���ж���
	 * 
	 * @return ���ж���
	 */
	//public QueryResult<T> getScrollData();

}
