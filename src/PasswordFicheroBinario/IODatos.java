package PasswordFicheroBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Password[] datos) {

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileOutputStream fo = new FileOutputStream(f); ObjectOutputStream escribir = new ObjectOutputStream(fo)) {

			for (Password p : datos) {
				if (p != null) {
					escribir.writeObject(p);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	public static Password[] cargarDatos(String rutaFichero) {

		String usuario;
		int password, cont = 0;
		boolean segura;

		Password[] vector = new Password[10];
		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileInputStream fi = new FileInputStream(f); DataInputStream leer = new DataInputStream(fi)) {

			while (true) {
				usuario = leer.readUTF();
				password = leer.readInt();
				segura = leer.readBoolean();

				Password p = new Password(usuario, password, segura);

				vector[cont] = p;

				cont++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Fin de lectura del fichero");
		}

		return vector;
		
	}

	public static Password[] cargarDatos2(String rutaFichero) {
		
		Password[] vector2 = new Password[10];
		String usuario;
		int password, cont = 0;
		boolean segura;
		
		File f = new File(rutaFichero);
		
//Comprobamos si existe el fichero y si no existe lo creamos
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//Leemos el fichero y lo almacenamos en variables y despues en el vector
		try (FileInputStream fi = new FileInputStream(f);
				ObjectInputStream leer = new ObjectInputStream(fi)){
			
			vector2[cont] = (Password) leer.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Has terminado de leer el fichero");
		} catch (ClassNotFoundException e) {
			System.out.println("Has terminado de leer el fichero");
		}
		
		return vector2;
	}
	
	
}
