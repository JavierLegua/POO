package EjercicioWhatsApp;

public class Main {

	public static void main(String[] args) {

		IODatos cargarDatos = new IODatos();

		Mensaje vMensaje[] = cargarDatos.cargarDatos("whatsapp.txt");

		for (Mensaje mensaje : vMensaje) {
			if (mensaje != null) {
				System.out.println(mensaje.mensajeWhatsapp());
			}
		}
		
		cargarDatos.guardarDatos(vMensaje, "telegram.txt");

	}
}
