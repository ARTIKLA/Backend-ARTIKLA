package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.entities.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo,Long>{

}
