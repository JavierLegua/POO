package EjercicioWhatsApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IODatos {

	private File f;
	private FileReader fr;
	private Scanner leer;
	private FileWriter fw;
	private PrintWriter pw;

	public IODatos() {
		this.f = null;
		this.fr = null;
		this.leer = null;
		this.fw = null;
		this.pw = null;
	}

	public Mensaje[] cargarDatos(String nombreFichero) {

		Mensaje vMensaje[] = new Mensaje[10];
		f = new File(nombreFichero);

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

			int pos = 0;

			while (leer.hasNext()) {
				String linea = leer.nextLine();
				vMensaje[pos] = new Mensaje(linea);
				pos++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			leer.close();

			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return vMensaje;
	}

	public void guardarDatos(Mensaje vMensaje[], String nombreFichero) {

		f = new File(nombreFichero);

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);

			for (Mensaje m : vMensaje) {
				if (m != null) {
					pw.println(m.mensajeWhatsapp());
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}

	}

}
