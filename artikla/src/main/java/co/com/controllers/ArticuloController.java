package co.com.controllers;


import co.com.entities.Articulo;
import co.com.negocio.ArticuloDto;
import co.com.services.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ArticuloController{

	@Autowired(required=true)
	iArticuloService articuloService;
        
        @RequestMapping("/traerArticulos")
        public List<Articulo> buscarArticulos(){
            
                return articuloService.findAll();
        }
      
        @RequestMapping(value="/addArticulo", method= RequestMethod.PUT) 
        public boolean buscarArticulo(@RequestBody int articulo ){
            System.out.println(articulo);
            return true;
        }
        
}
