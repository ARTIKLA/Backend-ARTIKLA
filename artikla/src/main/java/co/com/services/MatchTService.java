package co.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.controllers.MatchTController;
import co.com.entities.Articulo;
import co.com.entities.ArticulosMatch;
import co.com.entities.MatchT;
@RestController
public class MatchTService {
	
	@Autowired
	MatchTController matchtController;
	
	
	@RequestMapping("/generarMatch")
	public String crearMatch( @RequestBody MatchT matchInfo){
		String resultado = matchtController.insertarEditor(matchInfo);
		return resultado;
	}
	

    @RequestMapping("/traerArticulos")
    public List<ArticulosMatch> buscarArticulos(){
        return matchtController.buscarArticulosInicio();
    	//return articuloController.buscarArticulosInicio();
    }
	
}
