package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;

import co.com.entities.MatchT;
import co.com.repositories.MatchTRepository;

@Component
public class MatchTController {

	@Autowired
	MatchTRepository matchtRepository;
	
	public String insertarEditor(MatchT matchInsert) {
		MatchT matchT = new MatchT();
		matchT.setFechaSolicitud(new Date());
		matchT.setEstado(1);
		matchT.setId_articulo_match(matchInsert.getId_articulo_match());
		matchT.setId_autor(matchInsert.getId_autor());
		matchT.setId_editor(matchInsert.getId_editor());
		
		return "Hole";
	}
}
