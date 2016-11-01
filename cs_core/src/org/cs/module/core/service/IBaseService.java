package org.cs.module.core.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

import org.cs.util.Pager;

/**
 * 
 * @ClassName: IBaseService 
 * @Description: TODO
 * @author: cosco gt.fan@msn.cn
 * @date: 2016年8月20日 下午11:09:18 
 * @param <T>
 */
public interface IBaseService<T> {

	public T add(T t);

	public T delete(T t);

	public T update(T t);

	public void deleteByIds(String ids);
	
	public void deltetById(String...ids);

	public T findById(int id);

	public T findById(String id);

	public T findOne(String sql, Class<T> clazz);

	public Map<String, Object> findOne(String sql);

	public List<T> findAll(Pager page);

	public JSONObject getJson(int ret, Object result, String msg);
	
	List<?> findByHql(String hql, Pager page, Map<String, Object> params);
	
	List<?> findByHql(String hql,Map<String, Object> params);
}
