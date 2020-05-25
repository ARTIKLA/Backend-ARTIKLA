package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import co.com.controllers.AutorController;
import co.com.entities.Autor;

@RestController
public class AutorService {
	
	@Autowired
	AutorController autorController;
	
	
	@RequestMapping("/crearAutor")
	public String crearAutor(@RequestBody Autor autor){
		String respuesta= autorController.insertarAutor(autor);
		return respuesta;
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
