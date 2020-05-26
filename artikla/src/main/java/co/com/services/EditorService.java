package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.controllers.EditorController;
import co.com.entities.Editor;
import co.com.repositories.EditorRepository;
import java.util.List;

@RestController
public class EditorService {
	
	@Autowired(required=true)
	EditorRepository  editorRepository;
	
	@Autowired
	EditorController editorController;
	
	@RequestMapping("/obtenerEditores")
	public List<Editor> obtenerEditores(){
            List<Editor> editor = editorController.traerEditores();
            
                return editor;
	}
	
	@RequestMapping("/crearEditor")
	public String crearEditor( @RequestBody Editor editor){
		String resultado = editorController.insertarEditor(editor);
		return resultado;
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
				editor.setRol(2);
				editor.setNombreRevista("Nombre Revista");
				editor.setDescripcionRevista("Nombre Revista");
				editorRepository.save(editor);		
				return 1;		
		//	}else {
			//	return 0 ;
		//	}
	}
	
}
