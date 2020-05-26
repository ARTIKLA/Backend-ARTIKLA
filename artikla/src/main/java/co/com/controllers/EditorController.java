package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.entities.Autor;
import co.com.entities.Editor;
import co.com.repositories.EditorRepository;

@Component
public class EditorController {

	@Autowired
	EditorRepository editorRepository;
	
	
	public boolean insertarEditor(Editor editor) {
		Editor editorInsert = new Editor();
		editorInsert.setNombre(editor.getNombre());
		editorInsert.setDescripcion(editor.getDescripcion());
		editorInsert.setCorreo(editor.getCorreo());
		editorInsert.setClave(editor.getClave());
		editorInsert.setEstado(1);
		editorInsert.setRol(editor.getRol());
		editorInsert.setNombreRevista(editor.getNombreRevista());
		editorInsert.setDescripcionRevista(editor.getDescripcionRevista());
		editorRepository.save(editor);
		Editor editorGuardado = editorRepository.save(editor);
		if(editorGuardado.getId() >= 0) return true;
		return false;
	}
	public Iterable<Editor> traerEditores(){
		return  editorRepository.findAll();
	}
	
}
