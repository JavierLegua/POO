package PasswordFicheroBinario;

public class Main {

	public static void main(String[] args) {
		
		Password vPassword[] = new Password[10];
		vPassword[0] = new Password("Juan", 1, true);
		vPassword[1] = new Password("Pepe", 2, false);
		vPassword[2] = new Password("Javier", 5, true);
		vPassword[3] = new Password("Kacper", 3, false);
		
		IODatos.guardarDatos("pass.dat", vPassword);

	}

}
