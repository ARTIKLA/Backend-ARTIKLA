package co.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.entities.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo,Long>{

	public Articulo findById(long id);
}
