package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.entities.Articulo;
import java.util.List;
import java.util.Optional;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo,Long>{

	Articulo findById(long id);
        List<Articulo> findAllById(final Long id);
         @Override
        List<Articulo> findAll();
        
        @Override
        public Optional<Articulo> findById(Long id);
       
        
        
        
        
}
