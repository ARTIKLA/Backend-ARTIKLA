package co.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.controllers.EditorController;
import co.com.entities.Editor;
import co.com.entities.RespWS;
import co.com.entities.RespuestaWS;
import co.com.repositories.EditorRepository;

@RestController
public class EditorService {
	
	@Autowired(required=true)
	EditorRepository  editorRepository;
	
	@Autowired
	EditorController editorController;
	
	@RequestMapping("/obtenerEditores")
	public Iterable<Editor> obtenerEditores(){
		return editorController.traerEditores();
	}
	
	@RequestMapping("/crearEditor")
	public RespWS crearEditor( @RequestBody Editor editor){
		try {
			RespuestaWS.usuarioRegistrado.setSuccess(editorController.insertarEditor(editor));
			
			if(RespuestaWS.usuarioRegistrado.getSuccess())
				return RespuestaWS.usuarioRegistrado;
			else return RespuestaWS.errorGuardarUsuario;
		} catch(Exception ex) {
			return RespuestaWS.errorGuardarUsuario;
		}
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
