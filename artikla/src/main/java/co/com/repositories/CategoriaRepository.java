package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.entities.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

	
	
}
