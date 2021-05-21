package logica;

public class Materia {

	private String nombre;
	
	private Curso [] curso;
	
	private Docente docente;

	public Materia(String nombre, Curso[] curso, Docente docente) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.docente = docente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Curso[] getCurso() {
		return curso;
	}

	public void setCurso(Curso[] curso) {
		this.curso = curso;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}


	
	
	
}
