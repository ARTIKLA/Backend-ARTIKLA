package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.controllers.MatchTController;
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
}
