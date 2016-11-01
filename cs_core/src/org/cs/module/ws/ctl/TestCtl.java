package org.cs.module.ws.ctl;

import org.cs.module.core.ctl.BaseCtl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestCtl extends BaseCtl {

	@RequestMapping("say")
	public String say(String data){
		System.out.println("teset ....................");
		return "111111111111111111111111";
	}
	
}
