package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Categoria;
import co.com.repositories.AutorRepository;
import co.com.repositories.CategoriaRepository;
import java.util.List;

@RestController
public class CategoriaController {

	
	@Autowired(required=true)
	CategoriaRepository categoriaRepository;
	
	
	@RequestMapping("/insertarCategoria")
	public String crearCategoria(){
		Categoria categoria = new Categoria();
		categoria.setTitulo("Cinne");
		categoria.setDescripcion("Descripcion categoría Cine");
		categoria.setEstado(1);
		categoriaRepository.save(categoria);
		return "categoria "+categoria.getTitulo()+ " guardada";
	}
        
        @RequestMapping("/obtenerCategorias")
        public List<Categoria> traerCategorias(){
            return categoriaRepository.findAll();
        }
        
	
}
