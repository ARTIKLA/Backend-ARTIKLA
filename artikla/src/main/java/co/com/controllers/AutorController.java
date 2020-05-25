package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import co.com.entities.Autor;
import co.com.repositories.AutorRepository;

@Component
public class AutorController {
	
	
	@Autowired
	AutorRepository autorRepository;
	
	public String insertarAutor(Autor autor) {
		Autor autorInsert = new Autor();
		autorInsert.setNombre(autor.getNombre());
		autorInsert.setDescripcion(autor.getDescripcion());
		autorInsert.setCorreo(autor.getCorreo());
		autorInsert.setClave(autor.getClave());
		autorInsert.setEstado(1);
		autorInsert.setRol(autor.getRol());
		autorRepository.save(autor);
		return "holi";
	}
	
	public Autor buscarPorId(int idUsuario){
		return autorRepository.findById(idUsuario);
	}
}
