package logica;

public class Usuario {
	private String nombre;
	private int ci;
	
	private Tutor[] tutor;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public Tutor[] getTutor() {
		return tutor;
	}

	public void setTutor(Tutor[] tutor) {
		this.tutor = tutor;
	}

	public Usuario(String nombre, int ci, Tutor[] tutor) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.tutor = tutor;
	}
	
	
	
}
