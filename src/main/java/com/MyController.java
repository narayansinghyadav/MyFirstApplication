/**
 * 
 */
package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		System.out.print("hello");
		return new ModelAndView("welcome");
	}

}
