package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.entities.Categoria;
import co.com.entities.Editor;
import java.util.List;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

<<<<<<< HEAD
        Categoria findAllById(final Long id);
        List<Categoria> findAll();
    	
=======
        List<Categoria> findAllById(final Long id);
        @Override
        List<Categoria> findAll();
	
>>>>>>> aed4c555186f9a121b8015f1ea8c9d56780c547a
	
}
