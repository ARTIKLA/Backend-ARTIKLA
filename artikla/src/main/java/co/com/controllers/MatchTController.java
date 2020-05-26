package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.com.entities.Articulo;
import co.com.entities.ArticulosMatch;
import co.com.entities.Autor;
import co.com.entities.MatchT;
import co.com.repositories.ArticuloRepository;
import co.com.repositories.AutorRepository;
import co.com.repositories.MatchTRepository;

@Component
public class MatchTController {

	@Autowired
	MatchTRepository matchtRepository;
	
	@Autowired
	ArticuloRepository articuloRepository;
	
	@Autowired
	AutorRepository autorRepository;
	
	
	public String insertarEditor(MatchT matchInsert) {
		Date ahora = new Date();
		MatchT matchT = new MatchT();
		matchT.setFechaSolicitud(ahora);
		matchT.setEstado(1);
		matchT.setId_articulo_match(matchInsert.getId_articulo_match());
		matchT.setId_autor(matchInsert.getId_autor());
		matchT.setId_editor(matchInsert.getId_editor());
		
		return "Hole";
	}
	
	  public List<ArticulosMatch> buscarArticulosInicio() {
	    	Autor autor = new Autor();
	    	List<Articulo> articulosObj;
	    	articulosObj = articuloRepository.findAll();
	    	List<ArticulosMatch> articulosAndAutor = new ArrayList<>();
	    	ArticulosMatch articuloAndAutor = new ArticulosMatch();
	    	Articulo articulo1 = new Articulo();
		    for (Articulo ArticuloObj : articulosObj) {
		    	articulo1 = articuloRepository.findById(ArticuloObj.getId());
		    	autor = autorRepository.findById(articulo1.getAutor().getId());
		    	articuloAndAutor.setArticulo(ArticuloObj);
		    	articuloAndAutor.setAutor(autor);
		    	articulosAndAutor.add(articuloAndAutor);
			}
	    	return articulosAndAutor;
	    }
	
}
