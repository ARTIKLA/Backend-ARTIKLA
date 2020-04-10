package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Editor;
import co.com.repositories.EditorRepository;

@RestController
public class EditorController {
	
	@Autowired(required=true)
	EditorRepository  editorRepository;
	
	@RequestMapping("/obtenerEditores")
	public Iterable<Editor> obtenerEditores(){
		return  editorRepository.findAll();
	}
	
	@RequestMapping("/crearEditor")
	public String crearEditor(){
		Editor editor = new Editor();
		editor.setClave("aaa");
		editor.setCorreo("a@mail.com");
		editor.setNombre("Carlos");
		editorRepository.save(editor);
		return "usuario "+editor.getNombre()+ " guardado";
	}
	@RequestMapping("/buscarEditorClaveCorreo")
	public Editor obtenerEditorPorCorreoClave(){
		return editorRepository.findByCorreoAndClave("laura.vasquez@gmail.com","aaa"); 
	}
	@RequestMapping("/buscarEditorPorId")
	public Editor obtenerEditorPorId(){
		return editorRepository.findById(1); 
	}
	
}
