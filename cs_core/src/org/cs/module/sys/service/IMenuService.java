package org.cs.module.sys.service;

import java.util.List;

import org.cs.module.core.service.IBaseService;
import org.cs.module.sys.model.Menu;

public interface IMenuService extends IBaseService<Menu> {

	public List<Menu> getSuperMenuList();
	
}
