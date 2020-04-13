package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.entities.Editor;
import co.com.repositories.EditorRepository;

import java.util.List;	
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;	
import org.springframework.stereotype.Service;	
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
		editor.setNombre("Oscar");
		editor.setDescripcion("Descripcion");
		editor.setCorreo("@mail.com");
		editor.setClave("clave");
		editor.setEstado(1);
		editor.setRol("editor");
		editor.setNombreRevista("Nombre Revista");
		editor.setDescripcionRevista("Nombre Revista");
		editorRepository.save(editor);
		return "usuario "+editor.getNombre()+ " guardado";
	}

	@RequestMapping("/buscarEditorPorId")
	public Editor obtenerEditorPorId(){
		return editorRepository.findById(1); 
	}
	
	@RequestMapping("/editarEditor")
	public int actualizarEditor(){
			long num = 1;
			//customerUpdated.getId();		
		//	if (editorRepository.findById(num).isPresent()) {			
				Editor editor = new Editor();
				editor.setNombre("Oscar");
				editor.setDescripcion("Descripcion");
				editor.setCorreo("@mail.com");
				editor.setClave("clave");
				editor.setEstado(1);
				editor.setRol("editor1");
				editor.setNombreRevista("Nombre Revista");
				editor.setDescripcionRevista("Nombre Revista");
				editorRepository.save(editor);		
				return 1;		
		//	}else {
			//	return 0 ;
		//	}
	}
	
}
