package co.com.services;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Articulo;
import co.com.entities.Autor;
import co.com.entities.Categoria;
import co.com.entities.Rol;
import co.com.negocio.ArticuloDto;
import co.com.repositories.ArticuloRepository;
import co.com.repositories.AutorRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ArticuloController  {

	@Autowired(required=true)
	ArticuloRepository  articuloRepository;
	@Autowired(required=true)
	AutorRepository autorRepository;
	

	@RequestMapping("/insertarArticulo")
	public String crearArticulo(){
		//List<Categoria> categorias=;
		Articulo articulo= new Articulo();
		articulo.setDescripcion("Descripcion categoría Cine");
		//articulo.setFechaPublicacion("11/12/2020");
		articulo.setAutor(autorRepository.findById(15));
		articuloRepository.save(articulo);
		return "articulo "+articulo.getTitulo()+ " guardada";
	}
	
	@RequestMapping("/traerArticulo")
	public Articulo consultarArticulo() {
		return articuloRepository.findById(1);
	}
        
        @RequestMapping("/traerArticulos")
        public List<Articulo> buscarArticulos(){
            return articuloRepository.findAll();
        }
        
        @RequestMapping(value="/agregarArticulo", method= RequestMethod.POST) 
        public Articulo buscarArticulo(@RequestBody ArticuloDto articuloDto ){
            
            Rol rol = new Rol();
            rol.setDescripcion("autor");
            
            Autor autor = new Autor();
            autor.setId(1);
            autor.setRol("autor");
            autor.setNombre("autor1");
            
            Articulo articulo = new Articulo();
            articulo.setTitulo(articuloDto.getDescripcion());
            articulo.setDescripcion(articuloDto.getDescripcion());
            articulo.setAutor(autor);
            
            Categoria categoria = new Categoria();
            categoria.setDescripcion("Metodológicos");
            categoria.setDescripcion("nada");
            
            List<Categoria> categorias = new ArrayList<>();
            
            categorias.add(categoria);
            
            articulo.setCategorias(categorias);
            
            return articuloRepository.save(articulo);
        }

}
