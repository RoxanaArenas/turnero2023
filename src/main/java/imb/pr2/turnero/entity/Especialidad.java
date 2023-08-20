package imb.pr2.turnero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEspecialidad;
	@NotBlank(message = "El nombre de la especialidad no puede estar vacío")
	@Size(max = 40, message = "El nombre de la especialidad no debe superar los 40 caracteres")
	private String nombre;
	
	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
