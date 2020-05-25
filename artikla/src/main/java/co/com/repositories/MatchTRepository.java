package co.com.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import co.com.entities.MatchT;


@Repository
public interface MatchTRepository extends CrudRepository<MatchT, Long>{
	
	
}
