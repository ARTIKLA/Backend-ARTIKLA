package co.com.controllers;


import co.com.entities.Articulo;
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
    public String modificarArticulo(Articulo articulo) {
    	Articulo articuloDB = new Articulo();
    	articuloDB=articuloRepository.findById(articulo.getId());
    	articuloDB.setCategorias(articulo.getCategorias());
    	articuloDB.setTitulo(articulo.getTitulo());
    	articuloDB.setDescripcion(articulo.getDescripcion());
    	articuloRepository.save(articuloDB);
    	return "jelou jaguaryu";
    }
        
}
