package imb.pr2.turnero.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Profesional {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "El nombre no puede estar vacío")
	@Size(max = 60, message = "El nombre no debe superar los 60 caracteres")
	private String nombre;
	
	@NotBlank(message = "El apellido no puede estar vacío")
	@Size(max = 60, message = "El apellido no debe superar los 60 caracteres")
	private String apellido;
	
	@NotNull(message = "Debe ingresar una especialidad.")
	@OneToOne
	@JoinColumn(name="especialidadId")
	private Especialidad especialidad;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	

	
}
