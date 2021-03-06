package generarContraseña;

import java.util.Random;

public class Contraseña {

	private int longitud;
	private String contrasena;

	// constructores
	public Contraseña() {
		this.contrasena = "AAAaa123456"; // borrar luego despues de pruebas
		this.longitud = 11;
	}

	public Contraseña(int longitud) {
		this.longitud = longitud;
		contrasena = "";
		generarPassword();
	}

	public boolean esFuerte() {

		String letraMin = "abcdefghijklemnñopqrstuvwxyz";
		String letraMay = letraMin.toUpperCase();
		String numeros = "0123456789";
		int cont1 = 0, cont2 = 0, cont3 = 0;

		for (int i = 0; i < contrasena.length(); i++) {

			for (int j = 0; j < letraMay.length(); j++) {

				if (contrasena.substring(i, i + 1).equals(letraMay.substring(j, j + 1))) {
					cont2++;
				}
				if (contrasena.substring(i, i + 1).equals(letraMin.substring(j, j + 1))) {
					cont1++;
				}
			}
		}

		for (int i = 0; i < contrasena.length(); i++) {

			for (int j = 0; j < numeros.length(); j++) {

				if (contrasena.substring(i, i + 1).equals(numeros.substring(j, j + 1))) {
					cont3++;
				}
			}
		}
		if (cont2 > 2 && cont3 > 5 && cont1 > 1) {
			return true;
		}
		return false;
	}

	public void generarPassword() {

		String letraMin = "abcdefghijklemnñopqrstuvwxyz";
		String letraMay = letraMin.toUpperCase();
		String numeros = "0123456789";
		String posi = letraMin + letraMay + numeros;
		Random r = new Random();
		int aleatorio = 0;

		for (int i = 0; i < longitud; i++) {
			aleatorio = r.nextInt(posi.length());
			contrasena += posi.substring(aleatorio, aleatorio + 1);
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

}
