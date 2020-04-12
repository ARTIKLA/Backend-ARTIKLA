package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.entities.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long> {
	
	public Autor findById(long id);
	
}
