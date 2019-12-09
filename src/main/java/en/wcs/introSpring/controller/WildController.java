package en.wcs.introSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WildController {
	
	@RequestMapping("/workshop")
	@ResponseBody
	public String getWorkshop() {
		return "Introduction to Spring";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public Object getSlash() {
		return new WildObject("Wild", 42);
	}

}
