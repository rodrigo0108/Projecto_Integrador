package com.ramos.controllers;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ramos.models.CentroEducativo;
import com.ramos.models.Usuario;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.MultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String home(Model model) {
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResourceGet = client.resource("https://proyecto-api-kevinghanz.c9users.io/api/v1/centros_educativos");
		List<CentroEducativo> centros_educativos = webResourceGet.get(new GenericType<List<CentroEducativo>>() {});
		
		//Obtener el valor de sesion
		//String usuario= (String) httpSession.getAttribute("username");
		//System.out.println(usuario);
		
		model.addAttribute("lista", centros_educativos);
		
		return "home";
		
	}
	
	@RequestMapping(value="/home",method = RequestMethod.POST)
	public String envio(HttpSession httpSession,
						@RequestParam(value = "tipo_alquiler") String tipo_alquiler,
						@RequestParam(value = "centro_estudio") String centro_estudio_id,
						@RequestParam(value = "direccion") String direccion,
						@RequestParam(value = "distrito")String distrito,
						@RequestParam(value = "departamento")String departamento,
						@RequestParam(value = "precio")String precio,
						@RequestParam(value = "num_dor")String num_dor,
						@RequestParam(value = "num_ban")String num_ban,
						@RequestParam(value = "area")String area_total,
						@RequestParam(value = "imagen")File imagen,
						@RequestParam(value = "descripcion")String descripcion
						) {
		
		Usuario usuario= (Usuario) httpSession.getAttribute("usuario");
		//Capturo el id de la sesion
		String id=String.valueOf(usuario.getId());
		String estado="habilitado";
		//System.out.println(usuario.toString());
		/*
		ClientConfig clientConfig = new DefaultClientConfig();
		
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource("https://proyecto-api-kevinghanz.c9users.io/api/v1/inmuebles");
		
        FileDataBodyPart fileDataBodyPart = new FileDataBodyPart("imagen",
                imagen,
                MediaType.APPLICATION_OCTET_STREAM_TYPE);
        fileDataBodyPart.setContentDisposition(
                FormDataContentDisposition.name("imagen")
                        .fileName(imagen.getName()).build());
        
        final MultiPart multiPart = new FormDataMultiPart()
                .field("tipo", tipo_alquiler, MediaType.TEXT_PLAIN_TYPE)
                .field("direccion", direccion, MediaType.TEXT_PLAIN_TYPE)
                .field("distrito", distrito, MediaType.TEXT_PLAIN_TYPE)
                .field("departamento", departamento, MediaType.TEXT_PLAIN_TYPE)
                .field("precio", precio, MediaType.TEXT_PLAIN_TYPE)
                .field("num_dormitorios",num_dor, MediaType.TEXT_PLAIN_TYPE)
                .field("num_banios", num_ban, MediaType.TEXT_PLAIN_TYPE)
                .field("area_total", area_total, MediaType.TEXT_PLAIN_TYPE)
                .field("estado", estado, MediaType.TEXT_PLAIN_TYPE)
                .field("descripcion", descripcion, MediaType.TEXT_PLAIN_TYPE)
                .field("user_id", id, MediaType.TEXT_PLAIN_TYPE)
                .field("centro_educativo_id", centro_estudio_id, MediaType.TEXT_PLAIN_TYPE)
                .bodyPart(fileDataBodyPart);
        multiPart.setMediaType(MediaType.MULTIPART_FORM_DATA_TYPE);

        // POST request final
        ClientResponse response = webResource
                .type("multipart/form-data").post(ClientResponse.class,
                        multiPart);
        
        client.destroy();*/
		System.out.println(usuario.toString());
		System.out.println(imagen.getAbsolutePath());
		return "redirect:home";
		
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    
    public String logout(HttpSession httpSession) {
    	httpSession.removeAttribute("usuario");
        return "redirect:sesion";
    }
	
}
