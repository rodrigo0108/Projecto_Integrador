package com.ramos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpiezaController {
	@RequestMapping(value="/empieza",method = RequestMethod.GET)
	public String funcion() {
		return "empieza";
		
	}

}
