package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Autor;
import co.com.repositories.AutorRepository;

@RestController
public class AutorController {

	@Autowired(required=true)
	AutorRepository autorRepository;
	
	@RequestMapping("/crearAutor")
	public String crearAutor(){
		Autor autor= new Autor();
		autor.setNombre("Oscar");
		autor.setDescripcion("Descripcion");
		autor.setCorreo("@mail.com");
		autor.setClave("clave");
		autor.setEstado(1);
		autor.setRol("autor");
	//	autor.setArticulos(articulos);
		autorRepository.save(autor);
		return "usuario "+autor.getNombre()+ " guardado";
	}
	@RequestMapping("/buscarAutor")
	public Autor buscarPorId(){
		return autorRepository.findById(15);
	}
	
	
	
}
