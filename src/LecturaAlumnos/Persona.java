package LecturaAlumnos;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int nip;
	
	public Persona(String nombre, String apellido, int nip) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nip = nip;
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

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nip=" + nip + "]";
	}

	public String mostrar(int longitudLinea) {
		// Nombre, apellido ............ NIP
		
		int sumaPos = nombre.length() + apellido.length() + 6;
		String puntos = "";
		
		for (int i = 0; i < (longitudLinea-sumaPos); i++) {
			puntos += ".";
		}
		return (apellido + nombre + puntos + nip);
	}
	
	
	
}
