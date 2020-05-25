package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.entities.Articulo;
import co.com.negocio.ArticuloDto;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo,Long>{

		Articulo findById(long id);
        List<Articulo> findAllById(final Long id);
<<<<<<< HEAD
        List<Articulo> findAll();
        
        //Interfaz creadda de iArticuloService
        //List<Articulo> findAll();
        //List<Articulo> listarById(final Long idUsuario);
        //Articulo agregarArticuloDto(final ArticuloDto articulo );
        //Articulo editarArticulo(final Long idArticulo, final Long idUsuario);
        //Articulo eliminarArticulo(final Long idArticulo, Long idUsuario);
=======
         @Override
        List<Articulo> findAll();
        
        @Override
        public Optional<Articulo> findById(Long id);
       
        
        
        
        
>>>>>>> aed4c555186f9a121b8015f1ea8c9d56780c547a
}
