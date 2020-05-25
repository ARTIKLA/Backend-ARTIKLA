package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.negocio.Login;
import co.com.entities.Autor;
import co.com.entities.Usuario;
import co.com.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired(required= true)
	UsuarioRepository usuarioRepository;
	
	@RequestMapping(value="/iniciarSesion", method= RequestMethod.POST)  
	public Usuario obtenerEditorPorCorreoClave(@RequestBody Login login){
		
		return usuarioRepository.findByCorreoAndClave(login.getCorreoUsuario(), login.getPasswordUsuario()); 
	} 
	
}
