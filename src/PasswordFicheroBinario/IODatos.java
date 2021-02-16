package PasswordFicheroBinario;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Password[] datos) {
		
		File f = new File(rutaFichero);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try (FileOutputStream fo = new FileOutputStream(f);
					DataOutputStream escribir = new DataOutputStream(fo)){
				
					for (Password p : datos) {
						if (p != null) {
						escribir.writeUTF(p.getUsuario());
						escribir.writeInt(p.getPassword());
						escribir.writeBoolean(p.isSegura());
						}
					}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	
}
