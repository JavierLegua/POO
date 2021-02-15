package FicherosBinarios;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File fichero = new File("datos.dat");
		
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		//Escritura ficheros binarios
		
		try (FileOutputStream fo = new FileOutputStream(fichero);
				DataOutputStream escribir = new DataOutputStream(fo)){
			
			escribir.writeInt(10);
			escribir.writeUTF("Javier");
			escribir.writeInt(11);
			escribir.writeUTF("Pedro");
			escribir.writeInt(12);
			escribir.writeUTF("Miguel");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//Lectura ficheros binarios
		
		try (FileInputStream fi = new FileInputStream(fichero);
				DataInputStream leer = new DataInputStream(fi)){
			while(true) {	
				System.out.println(leer.readInt());
				System.out.println(leer.readUTF());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Todo correcto");
		}
	}

}
