package co.com.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.entities.Editor;
import co.com.entities.Usuario;
@Repository
public interface EditorRepository extends CrudRepository<Editor, Long> {

	public List<Editor> findAll();
	public Editor findById(long id);
	public Editor findByCorreoAndClave(String correo, String clave);
	
}
