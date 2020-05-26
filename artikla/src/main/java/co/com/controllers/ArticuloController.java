package co.com.controllers;


import co.com.entities.Articulo;
import co.com.entities.Autor;
import co.com.entities.Categoria;
import co.com.entities.Rol;
import co.com.negocio.ArticuloDto;
import co.com.repositories.ArticuloRepository;
import co.com.services.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticuloController{

	@Autowired(required=true)
	ArticuloRepository articuloRepository;
        
    public List<Articulo> buscarArticulos(){
    	return articuloRepository.findAll();
    }
    public void modificarArticulo(Articulo articulo) {
    	Articulo articuloDB = new Articulo();
    	articuloDB=articuloRepository.findById(articulo.getId());
    	articuloDB.setCategorias(articulo.getCategorias());
    	articuloDB.setTitulo(articulo.getTitulo());
    	articuloDB.setDescripcion(articulo.getDescripcion());
    	articuloRepository.save(articuloDB);
    }
    
    
    public void agregarArticulo(final Articulo articulo){
        
        Rol rol = new Rol();
        rol.setDescripcion("autor");
        
        Autor autor = new Autor();
        autor.setId(1);
        autor.setRol(1);
        autor.setNombre("autor1");
        
        
        articulo.setTitulo(articulo.getTitulo());
        articulo.setDescripcion(articulo.getDescripcion());
        articulo.setAutor(autor);
        articulo.setFechaPublicacion(new Date());
        
        articulo.setCategorias(articulo.getCategorias());
              
        articuloRepository.save(articulo);
        
    }
    
    public String eliminarArticulo(Long id) {
    	articuloRepository.deleteById(id);
    	return "proceso";
    }
        
}
