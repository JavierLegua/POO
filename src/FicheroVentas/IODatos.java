package FicheroVentas;

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

	public static void guardarDatos(String rutaFichero, Ventas vVentas[]) {

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileOutputStream fo = new FileOutputStream(f); DataOutputStream escribir = new DataOutputStream(fo)) {

			for (Ventas v : vVentas) {
				if (v != null) {
					escribir.writeUTF(v.getCliente());
					escribir.writeInt(v.getCodProducto());
					escribir.writeInt(v.getUniVendidas());
					escribir.writeDouble(v.getPrecio());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Has terminado de leer el fichero");
		}
	}

	public static Ventas[] cargarDatos(String rutaFichero) {

		Ventas[] vector = new Ventas[10];
		int cont = 0;

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
				String cliente = leer.readUTF();
				int codProducto = leer.readInt();
				int uniVendidas = leer.readInt();
				double precio = leer.readDouble();

				Ventas v = new Ventas(cliente, codProducto, uniVendidas, precio);

				vector[cont] = v;
				cont++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Datos cargados a memoria");
		}
		return vector;
	}
	
	public static void guardarDatos2(String rutaFichero, Ventas vVentas2[]) {

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileOutputStream fo = new FileOutputStream(f); 
				ObjectOutputStream escribir = new ObjectOutputStream(fo)) {

			for (Ventas v : vVentas2) {
				if (v != null) {
					escribir.writeObject(v);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Has terminado de leer el fichero");
		}
	}
	
	public static Ventas[] cargarDatos2(String rutaFichero) {

		Ventas[] vector2 = new Ventas[10];
		int cont = 0;

		File f = new File(rutaFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileInputStream fi = new FileInputStream(f); 
				ObjectInputStream leer = new ObjectInputStream(fi)) {

			while (true) {
				vector2[cont] = (Ventas)leer.readObject();
				cont++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Datos cargados a memoria");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return vector2;
	}
}
