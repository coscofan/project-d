package org.cs.module.mgr.ctl;

import org.apache.log4j.Logger;
import org.cs.module.core.ctl.BaseCtl;
import org.cs.module.sys.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mgr")
public class LoginCtl extends BaseCtl{

	private  Logger log = Logger.getLogger(LoginCtl.class);
	
	@Autowired 
	private IMenuService menuService;
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("login")
	public String login(String account, String pwd, String code,  ModelMap mm){
		
		 return "redirect:/mgr/main.cs";
	}
	
	
	@RequestMapping("main")
	public String main(String account, String pwd, String code,  ModelMap mm){
		
		 return "main";
	}
	
	
	
	
}
