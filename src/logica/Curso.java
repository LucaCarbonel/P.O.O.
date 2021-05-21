package logica;

public class Curso {

	private String nombre;

	private Estudiante estudiante;

	public Curso(String nombre, Estudiante estudiante) {
		super();
		this.nombre = nombre;
		this.estudiante = estudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	

	
}
