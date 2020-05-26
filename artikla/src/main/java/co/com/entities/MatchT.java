package co.com.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MatchT {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long id_autor;
	private long idEditor;
	private int estado;
	private Date fechaSolicitud;
	private Date fechaAceptacion;
	private long idArticulo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "chat_id", referencedColumnName = "id")
	private Chat chat_id;
	
	public Chat getChat_id() {
		return chat_id;
	}
	public void setChat_id(Chat chat_id) {
		this.chat_id = chat_id;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public Date getFechaAceptacion() {
		return fechaAceptacion;
	}
	public void setFechaAceptacion(Date fechaAceptacion) {
		this.fechaAceptacion = fechaAceptacion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_autor() {
		return id_autor;
	}
	public void setId_autor(long id_autor) {
		this.id_autor = id_autor;
	}
	public long getId_editor() {
		return idEditor;
	}
	public void setId_editor(long id_editor) {
		this.idEditor = id_editor;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public long getId_articulo_match() {
		return idArticulo;
	}
	public void setId_articulo_match(long id_articulo_match) {
		this.idArticulo = id_articulo_match;
	}

	
}
