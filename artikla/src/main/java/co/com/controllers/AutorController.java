package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Component;
import co.com.entities.Autor;
import co.com.repositories.AutorRepository;

@Component
public class AutorController {
	
	
	@Autowired
	AutorRepository autorRepository;
	
	public boolean insertarAutor(Autor autor) {
		Autor autorInsert = new Autor();
		autorInsert.setNombre(autor.getNombre());
		autorInsert.setDescripcion(autor.getDescripcion());
		autorInsert.setCorreo(autor.getCorreo());
		autorInsert.setClave(autor.getClave());
		autorInsert.setEstado(1);
		autorInsert.setRol(autor.getRol());
		Autor autorGuardado = autorRepository.save(autor);
		if(autorGuardado.getId() > 0) return true;
		return false;
	}
	
	public Autor buscarPorId(int idUsuario){
		return autorRepository.findById(idUsuario);
	}
	
	public List<Autor> buscarAutores(){
		return autorRepository.findAll();
	}
}
