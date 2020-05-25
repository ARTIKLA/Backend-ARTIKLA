package co.com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class ArticulosMatch {

	private long id;

	private String titulo;

	private String descripcion;

	private Autor autor; 

	private Date fechaPublicacion;
	
	private List<Categoria> categorias;
	

}
