package ClinicaMedica;

import java.util.Random;
import java.util.Scanner;

public class Persona {

	private String nombre;
	private String dni;
	private int edad;
	private char sexo; // M Mujer - H Hombre
	private double peso;
	private double altura; // En M

	// Constantes
	private final char HOMBRE = 'H';
	private final char MUJER = 'M';
	private final int SOBREPESO = 1;
	private final int PESOIDEAL = 0;
	private final int BAJOPESO = -1;

	// Constructores
	public Persona() {
		this.nombre = "";
		this.dni = generarDNI();
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = dimeNombre();
		this.dni = generarDNI();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) {
		this.nombre = dimeNombre();
		this.dni = comprobarDNI(dni);
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = dimeAltura();
	}

	public int calcularIMC() {

		double peso = (this.peso / (altura * altura));

		if (peso < 18.5) {
			return BAJOPESO;
		} else if (peso < 24.9) {
			return PESOIDEAL;
		} else {
			return SOBREPESO;
		}

	}

	public boolean mayorEdad() {

		// True=menor - false=mayor
		if (edad < 18) {
			return false;
		} else {
			return true;
		}
	}

	private char comprobarSexo(char sexo) {

		if (sexo == HOMBRE || sexo == MUJER) {
			return sexo;
		} else {
			return HOMBRE;
		}
	}

	private String generarDNI() {

		Random r = new Random();

		String dni = "";

		for (int i = 0; i < 8; i++) {
			dni = dni + r.nextInt(10);
		}
		dni += "-" + generarLetraDNI(dni);
		return dni;
	}

	private String generarLetraDNI(String dni) {
		String letra = "";

		int resto = 0;
		int dniNum = Integer.valueOf(dni);
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		resto = dniNum % 23;
		letra += letras.substring(resto, resto + 1);

		return letra;
	}

	private String comprobarDNI(String dni) {

		boolean valido = false;
		String letraValida, letraRecibida;
		String numDni;

		numDni = dni.substring(0, 8);
		letraRecibida = dni.substring(9);

		letraValida = generarLetraDNI(numDni);

		if (letraRecibida.equalsIgnoreCase(letraValida)) {
			valido = true;
		}
		if (valido) {
			return dni;
		} else {
			// Dos opciones - 1º Corregir letra mal o
			// 2º generar un dni nuevo
			return numDni + letraValida;
		}
	}

	private String dimeNombre() {

		Scanner leer = new Scanner(System.in);
		System.out.println("dime el nombre");
		this.nombre = leer.next();
		return nombre;
	}

	// private String dimeSexo() {

	// Scanner leer = new Scanner(System.in);
	// System.out.println("dime tu genero");
	// this.sexo = leer.next();
	// return nombre;
	// }

	private double dimeAltura() {

		Scanner leer = new Scanner(System.in);
		System.out.println("dime tu altura en metros");
		this.altura = leer.nextInt();
		return altura;
	}

	@Override
	public String toString() {
		String sexo;
		if (this.sexo == HOMBRE) {
			sexo = "Hombre";
		} else {
			sexo = "Mujer";
		}

		return nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + "kg, altura=" + altura
				+ "m";
	}

}
