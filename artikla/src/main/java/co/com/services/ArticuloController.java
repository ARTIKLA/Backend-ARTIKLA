package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.com.repositories.ArticuloRepository;

@RestController
public class ArticuloController {

	@Autowired(required=true)
	ArticuloRepository  articuloRepository;
	
}
