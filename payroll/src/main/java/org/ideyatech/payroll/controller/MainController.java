package org.ideyatech.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {	
	
	@RequestMapping("/")
    public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("index");
		return model;
    }
	
	@RequestMapping(value={"/login"}, method = RequestMethod.POST)
	public ModelAndView login(){
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
	public ModelAndView getlogin(){
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
}

