package logica;

public class Estudiante extends Usuario {

	private String direccion;

	public Estudiante(String nombre, int ci, Tutor[] tutor, String direccion) {
		super(nombre, ci, tutor);
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
