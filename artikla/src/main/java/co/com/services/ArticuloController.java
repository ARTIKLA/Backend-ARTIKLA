package co.com.services;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Articulo;
import co.com.repositories.ArticuloRepository;
import co.com.repositories.AutorRepository;

@RestController
public class ArticuloController {

	@Autowired(required=true)
	ArticuloRepository  articuloRepository;
	@Autowired(required=true)
	AutorRepository autorRepository;
	

	@RequestMapping("/insertarArticulo")
	public String crearArticulo(){
		//List<Categoria> categorias=;
		Articulo articulo= new Articulo();
		articulo.setDescripcion("Descripcion categoría Cine");
		//articulo.setFechaPublicacion("11/12/2020");
		articulo.setAutor(autorRepository.findById(15));
		articuloRepository.save(articulo);
		return "articulo "+articulo.getTitulo()+ " guardada";
	}
	
	@RequestMapping("/traerArticulo")
	public Articulo consultarArticulo() {
		return articuloRepository.findById(1);
	}
}
