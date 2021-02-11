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
		
		Mensaje[] vMensaje = new Mensaje[10];
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}while(leer.hasNext()) {
			
		}
		return vMensaje;
	}
	
	
}
