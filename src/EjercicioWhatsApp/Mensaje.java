package EjercicioWhatsApp;

public class Mensaje {

	String nombre;
	String mensaje;

	public Mensaje(String nombre, String mensaje) {
		this.nombre = nombre;
		this.mensaje = mensaje;
	}

	public Mensaje(String linea) {
		int pos = linea.indexOf(":");
		this.nombre = linea.substring(pos + 1);
		this.mensaje = linea.substring(0, pos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String mensajeWhatsapp() {
		return nombre + ":" + mensaje;
	}

	@Override
	public String toString() {
		return mensaje + ":" + nombre;
	}

}
