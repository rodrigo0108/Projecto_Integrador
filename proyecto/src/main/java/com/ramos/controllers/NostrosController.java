package com.ramos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NostrosController {
	
	@RequestMapping(value="/nosotros",method = RequestMethod.GET)
	public String funcion() {
		return "nosotros";
		
	}
}
