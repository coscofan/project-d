package org.cs.module.sys.service.impl;

import java.util.List;

import org.cs.module.core.service.impl.BaseService;
import org.cs.module.sys.model.Menu;
import org.cs.module.sys.service.IMenuService;
import org.cs.util.Pager;
import org.springframework.stereotype.Service;

@Service("menuService")
public class MenuService extends BaseService<Menu> implements IMenuService {

	@Override
	public Pager getSuperMenuList(Pager page){
		return this.findPageByHql("from Menu where pid = 0 and display = true order by weight", page, null);
//		return (List<Menu>) this.findByHql("from Menu where pid = 0 and display = true order by weight", null);
	}
	
	
	@Override
	public List<Menu> getSuperMenuList() {
		// TODO Auto-generated method stub
		return (List<Menu>) this.findByHql("from Menu where pid = 0 and display = true order by weight", null);
	}



	@Override
	public List<Menu> getSecMenuList(){
		return (List<Menu>) this.findByHql("from Menu where pid <> 0 and display = true order by weight ", null);
	}
	
	
}
