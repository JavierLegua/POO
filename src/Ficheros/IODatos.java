package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

		public static void mostrar(String nombreFichero, int longitudLinea) {
			
			File f = new File(nombreFichero);
			FileReader fr = null;
			Scanner leer = null;
		
			//Comprobar si el fichero existe.
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			try {
				fr = new FileReader(f);
				leer = new Scanner(fr);
				
				//Mostrar por pantalla datos del fichero
				while(leer.hasNext()) {
					String linea = leer.nextLine();
					//Tratamos las lineas
					formatearLinea(linea, longitudLinea);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				leer.close();
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
		
	private static void formatearLinea(String linea, int longitudLinea) {
		Persona p = null;
		
		String nombre = "", apellido = "", aux;
		int nip;
		
		nip = Integer.parseInt(linea.substring(0, 6));
		aux = linea.substring(7);
		
		//Necesitamos nombre y apellido
		
		for (int i = 0; i < aux.length(); i++) {
			if (aux.substring(i,i+1).equals(",")) {
				apellido = aux.substring(0, i);
				nombre = aux.substring(i+1);
				break;
			}
		}
		p = new Persona(nombre, apellido, nip);
		System.out.println(p.mostrar(longitudLinea));
	}

}
