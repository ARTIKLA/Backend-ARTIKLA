package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import co.com.controllers.AutorController;
import co.com.entities.Autor;
import co.com.entities.RespWS;
import co.com.entities.RespuestaWS;

@RestController
public class AutorService {
	
	@Autowired
	AutorController autorController;
	
	
	@RequestMapping("/crearAutor")
	public RespWS crearAutor(@RequestBody Autor autor){
		try {
			RespuestaWS.usuarioRegistrado.setSuccess(autorController.insertarAutor(autor));
			
			if(RespuestaWS.usuarioRegistrado.getSuccess())
				return RespuestaWS.usuarioRegistrado;
			else return RespuestaWS.errorGuardarUsuario;
		} catch(Exception ex) {
			return RespuestaWS.errorGuardarUsuario;
		}
	}
	
	
	@RequestMapping("/buscarAutor")
	public Autor buscarPorId(@RequestParam int id){
		return autorController.buscarPorId(id);
	}
	

	@RequestMapping("/posiblesMatchT")
	public Iterable<Autor> consultarPosiblesMatch(){
		return autorController.buscarAutores();
	}        
	
}
