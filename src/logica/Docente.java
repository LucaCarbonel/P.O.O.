package logica;

import java.time.LocalDate;

public class Docente extends Usuario {
	private LocalDate fechaIngreso;
	
	private Materia materia;

	public Docente(String nombre, int ci, Tutor[] tutor, LocalDate fechaIngreso, Materia materia) {
		super(nombre, ci, tutor);
		this.fechaIngreso = fechaIngreso;
		this.materia = materia;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	
}
