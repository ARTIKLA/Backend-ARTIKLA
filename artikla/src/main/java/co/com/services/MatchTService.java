package co.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.controllers.CorreoController;
import co.com.controllers.MatchTController;
import co.com.entities.Articulo;
import co.com.entities.ArticulosMatch;
import co.com.entities.Autor;
import co.com.entities.MatchT;
@RestController
public class MatchTService {
	
	@Autowired
	MatchTController matchtController;
	
	@Autowired
	CorreoController correoController;
	
	
	@RequestMapping("/generarMatch")
	public String crearMatch( @RequestBody MatchT matchInfo){
		String resultado = matchtController.solicitarMatch(matchInfo);
		return resultado;
	}
	

        @RequestMapping("/traerArticulos")
    public List<Articulo> buscarArticulos(){
        return matchtController.buscarArticulosInicio();
    	//return articuloController.buscarArticulosInicio();
    }
    
    
    @RequestMapping("/obtenerPosiblesMatchAutores")
    public List<Autor> obtenerPosiblesMatchAutores(@RequestBody Long idEditor){
        return matchtController.obtenerPosiblesMatchAutores(idEditor);
    	//return articuloController.buscarArticulosInicio();
    }
	
    @RequestMapping("/crearRelacionMatch")
    public void enviarCorreo(@RequestBody long idMatch){
    	matchtController.crearMatchSuccess(idMatch);
    	//return articuloController.buscarArticulosInicio();
    }
}
