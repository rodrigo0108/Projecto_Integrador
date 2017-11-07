package com.ramos.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PerfilController {
	
	@RequestMapping(value="/perfil",method = RequestMethod.GET)
	public String perfil() {
		return "perfil";
		
	}

}
