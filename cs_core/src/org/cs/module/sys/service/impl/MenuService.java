package org.cs.module.sys.service.impl;

import java.util.List;

import org.cs.module.core.service.impl.BaseService;
import org.cs.module.sys.model.Menu;
import org.cs.module.sys.service.IMenuService;
import org.springframework.stereotype.Service;

@Service("menuService")
public class MenuService extends BaseService<Menu> implements IMenuService {

	@Override
	public List<Menu> getSuperMenuList(){
		return (List<Menu>) this.findByHql("from Menu where pid = 0", null);
	}
	
}
