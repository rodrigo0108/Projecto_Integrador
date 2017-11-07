package com.ramos.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ramos.models.UserLog;
import com.ramos.models.Usuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

@Controller
public class SesionController {
	
	@RequestMapping(value="/sesion",method = RequestMethod.GET)
	public String funcion() {
		return "sesion";
		
	}
	
	@RequestMapping(value = "/sesion", method = RequestMethod.POST)
	public String login(@RequestParam(value = "username") String username,
						@RequestParam(value = "password") String password,
						HttpSession session,
						Model model) {
			
			UserLog userlog= new UserLog();
			
			userlog.setEmail(username);
			userlog.setPassword(password);
			
			ClientConfig clientConfig = new DefaultClientConfig();
			clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
			Client client = Client.create(clientConfig);
			WebResource webResource = client.resource("http://proyecto-api-kevinghanz.c9users.io/login");
			ClientResponse response = webResource.type("application/json").post(ClientResponse.class,userlog);
			
			if(response.getStatus()==200) {
				Usuario usuario= response.getEntity(Usuario.class);
				
				session.setAttribute("usuario", usuario);
				
				return "redirect:home";
			}else if(response.getStatus()==401){
				model.addAttribute("error", "Credenciales incorrectos");
				return "sesion";
			}else {
				return "redirect:sesion";
			}
		
	}
}
