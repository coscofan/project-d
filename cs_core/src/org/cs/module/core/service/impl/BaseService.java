package org.cs.module.core.service.impl;

import java.util.List;
import java.util.Map;

import org.cs.module.core.dao.IBaseDao;
import org.cs.module.core.service.IBaseService;
import org.cs.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @ClassName: BaseService 
 * @Description: TODO
 * @author: cosco gt.fan@msn.cn
 * @date: 2016年8月20日 下午11:09:05 
 * @param <T>
 */
public class BaseService<T> implements IBaseService<T> {

	@Autowired
	IBaseDao<T> baseDao;

	public BaseService() {
	}

	@Override
	public List<T> findAll(Pager page) {
		return baseDao.findAll(page);
	}

	@Transactional(readOnly = false)
	public T add(T o) {
		return baseDao.insert(o);
	}

	@Transactional(readOnly = false)
	public T delete(T o) {
		return baseDao.delete(o);
	}

	@Override
	public T findOne(String sql, Class<T> clazz) {
		return this.baseDao.findOne(sql, clazz);
	}

	@Override
	public Map<String, Object> findOne(String sql) {
		List<Map<String, Object>> list = this.baseDao.findAll(sql);

		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteByIds(String ids) {
		StringBuffer sb = new StringBuffer();
		String[] split = ids.split(",");
		for (String id : split) {
			id = "'" + id + "',";
			sb.append(id);
		}
		if (sb.length() > 0)
			sb.deleteCharAt((sb.length() - 1));
		String where = " and id in (" + sb.toString() + ")";
		baseDao.deleteByWhere(where);
	}
	
	@Override
	@Transactional(readOnly = false)
	public void deltetById(String...ids){
		StringBuffer sb = new StringBuffer();
		for(String id : ids){
			id = "'" + id + "',";
			sb.append(id);
		}
		
		if (sb.length() > 0)
			sb.deleteCharAt((sb.length() - 1));
		String where = " and id in (" + sb.toString() + ")";
		
		baseDao.deleteByWhere(where);
		
	}

	@Override
	public T findById(String id) {
		return baseDao.findById(id);
	}

	@Override
	public T findById(int id) {
		return baseDao.findById(id);
	}

	@Override
	@Transactional(readOnly = false)
	public T update(T t) {
		// TODO Auto-generated method stub
		return this.baseDao.update(t);
	}
	

	@Override
	public List<?> findByHql(String hql, Pager page, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return this.baseDao.findByHql(hql, page, params);
	}

	@Override
	public List<?> findByHql(String hql, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return findByHql(hql, null, params);
	}
	
	@Override
	public <E> E findBySql(String sql, Class<E> clazz) {
		// TODO Auto-generated method stub
		return this.baseDao.findBySql(sql, clazz);
	}

	@Override
	public List<?> findBySql(String sql) {
		// TODO Auto-generated method stub
		return this.baseDao.findBySql(sql, null);
	}

	public JSONObject getJson(int ret, Object result, String msg) {
		JSONObject json = new JSONObject();
		json.put("ret", ret);
		json.put("data", result);
		json.put("msg", msg);
		return json;
	}

}
