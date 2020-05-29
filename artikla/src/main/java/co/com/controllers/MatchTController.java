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
import co.com.entities.Usuario;
import co.com.repositories.ArticuloRepository;
import co.com.repositories.AutorRepository;
import co.com.repositories.MatchTRepository;
import co.com.repositories.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component
public class MatchTController {

         final Logger logger = LoggerFactory.getLogger(MatchTController.class);
    
	@Autowired
	MatchTRepository matchtRepository;
	
	@Autowired
	ArticuloRepository articuloRepository;
	
	@Autowired
	AutorRepository autorRepository;
        
        @Autowired
        UsuarioRepository usuarioRepository;
	
	
	public String solicitarMatch(MatchT matchInsert) {
		MatchT matchT = new MatchT();
		matchT.setFechaSolicitud(new Date());
		matchT.setEstado(1);
		matchT.setId_articulo_match(matchInsert.getId_articulo_match());
		matchT.setId_autor(matchInsert.getId_autor());
		matchT.setId_editor(matchInsert.getId_editor());
		
		return "Hole";
	}
	
	  public List<Articulo> buscarArticulosInicio() {
	    	
	    	List<Articulo> articulosObj = new ArrayList<>();
                
	    	articulosObj = articuloRepository.findAll();
                
		    for (Articulo articuloObj : articulosObj) {
                            Optional<Usuario> usuario = null;
                            Autor autor = new Autor();

                            logger.debug(usuario.toString());
                                autor.setNombre(usuario.get().getNombre());
                                autor.setId(usuario.get().getId());
                                autor.setDescripcion(usuario.get().getDescripcion());
                           
                            articuloObj.setAutor(autor);
                }
	    	return articulosObj ;
	    }
	  
	  public List<Autor> obtenerPosiblesMatchAutores(Long idEditor) {
		  List<Autor> autoresMatch = new ArrayList<Autor>();
		  
		  for(Autor autor : autorRepository.findAll()) {
			  List<Articulo> articulos = autor.getArticulos();
			  autor.setArticulos(new ArrayList<Articulo>());
			  if(!articulos.isEmpty()) {
				  for(Articulo articulo : articulos) {
					  if(matchtRepository.findByIdArticuloAndIdEditor(articulo.getId(), idEditor) == null) {
						  autor.getArticulos().add(articulo);
					  }
				  }
				  autoresMatch.add(autor);
			  }
		  }
		  
		  return autoresMatch;
	  }
	
}
