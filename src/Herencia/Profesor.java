package Herencia;

public final class Profesor extends Personal{
	
	private String asignatura;

	public Profesor(String nombre, int edad, String asignatura) {
		super(nombre, edad);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return super.toString() + " Profesor [asignatura=" + asignatura + "]";
	}

}
