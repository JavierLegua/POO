package PasswordFicheroBinario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Password vPassword[] = new Password[10]; 
		 * vPassword[0] = new Password("Juan",1, true);
		 * vPassword[1] = new Password("Pepe", 2, false);
		 * vPassword[2] = new Password("Javier", 5, true);
		 * vPassword[3] = new Password("Kacper", 3, false);
		 */

		Password vPassword[] = IODatos.cargarDatos2("pass.dat");

		for (Password p : vPassword) {
			if ((p != null)) {
				System.out.println(p);
			}
		}

//Guardar nueva contraseña
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un nuevo usuario");
		String usuario = leer.nextLine();
		System.out.println("Dime una nueva contraseña");
		int password = leer.nextInt();
		System.out.println("Dime si la contraseña es segura (true-si / false-no)");
		boolean segura = leer.nextBoolean();
		
		Password p = new Password(usuario, password, segura);
		
		for (int i = 0; i < vPassword.length; i++) {
			if (vPassword[i] == null) {
				vPassword[i] = p;
				break;
			}
		}
		
		IODatos.guardarDatos("pass.dat", vPassword);

	}

}
