package co.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@Entity (name = "editor")
public class Editor extends Usuario {
	

	private String nombreRevista;
	private String descripcionRevista;

	public String getNombreRevista() {
		return nombreRevista;
	}
	public void setNombreRevista(String nombreRevista) {
		this.nombreRevista = nombreRevista;
	}
	public String getDescripcionRevista() {
		return descripcionRevista;
	}
	public void setDescripcionRevista(String descripcionRevista) {
		this.descripcionRevista = descripcionRevista;
	}
	
	
}
