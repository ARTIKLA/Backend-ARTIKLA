package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Autor;
import co.com.repositories.AutorRepository;

@RestController
public class AutorController {

	@Autowired(required=true)
	AutorRepository autorRepository;
	
	@RequestMapping("/crearAutor")
	public String crearAutor(@RequestBody Autor autor){
		autorRepository.save(autor);
		return "usuario "+autor.getNombre()+ " guardado";
	}
	@RequestMapping("/buscarAutor")
	public Autor buscarPorId(){
		return autorRepository.findById(15);
	}
	
	
	
}
