package org.cs.module.mgr.ctl;

import java.util.List;

import org.apache.log4j.Logger;
import org.cs.module.core.ctl.BaseCtl;
import org.cs.module.sys.model.Menu;
import org.cs.module.sys.service.IMenuService;
import org.cs.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/menu")
public class MenuCtl extends BaseCtl {
	
	Logger log = Logger.getLogger(MenuCtl.class);

	@Autowired
	IMenuService menuService;
	
	@RequestMapping("list")
	public String list(ModelMap mm){
//		List<Menu> superMenuList = this.menuService.getSuperMenuList();
//		mm.put("superMenuList", superMenuList);
		return "menu/list";	
		
	}
	
	@RequestMapping(value="list2", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String list2(ModelMap mm){
		List<Menu> superMenuList = this.menuService.getSuperMenuList();
		mm.put("json", JSONObject.toJSONString(superMenuList, features));
		JSONObject json = new JSONObject();
		json.put("draw", 1);
		json.put("recordsTotal", superMenuList.size());
		json.put("recordsFiltered", superMenuList.size());
		json.put("data", superMenuList);
		return json.toJSONString();
//		return superMenuList;
	}
	
	@RequestMapping("transfer")
	public String transfer(String id, String pid, String action, ModelMap mm){
		Menu menu = null;
		
		List<Menu> superMenuList = this.menuService.getSuperMenuList();
		mm.put("superMenuList", superMenuList);
		
		if(StringUtil.isNotBlank(id)){
			menu = this.menuService.findById(Integer.valueOf(id.trim()));
			mm.put("menu", menu);
		}
		
		return "menu/" + action;
	}
	
	@RequestMapping("add")
	@ResponseBody 
	public String add(Menu menu, ModelMap mm){
		
		if(menu != null ){
			this.menuService.add(menu);
			mm.put("superMenuList", this.menuService.getSuperMenuList());
		}
		return "menu/list"; 
	}
	
	@RequestMapping("modify")
	public String modify(Menu menu, ModelMap mm){
		menu.setDisplay(true);
		this.menuService.update(menu);
		
		mm.put("superMenuList", this.menuService.getSuperMenuList());
		
		return "menu/list"; 
	}
	
	@RequestMapping("del")
	public String del(Menu menu, ModelMap mm){
		
		mm.put("superMenuList", this.menuService.getSuperMenuList());
		
		return "menu/list"; 
	}
	
	
	
	
	
	
	
	
	
}
