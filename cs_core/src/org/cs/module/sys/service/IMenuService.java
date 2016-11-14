package org.cs.module.sys.service;

import java.util.List;

import org.cs.module.core.service.IBaseService;
import org.cs.module.sys.model.Menu;
import org.cs.util.Pager;

public interface IMenuService extends IBaseService<Menu> {

	public Pager getSuperMenuList();
	
	public List<Menu> getSecMenuList();
	
}
