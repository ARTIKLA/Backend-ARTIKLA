package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.repositories.AutorRepository;

public class AutorController {

	@Autowired(required=true)
	AutorRepository autorRepository;
	
	
}
