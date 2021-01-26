package GestionBebidas;

public class Main {

	public static void main(String[] args) {
		
		Almacen c = new Almacen("Javier legua");
		Azucarada z = new Azucarada("3", 4, 5, "coca cola", 2, true);
		
		System.out.println(z.toString());
		//Calcular precio estanteria funciona
		//Calcular precio marca no funciona
		//Calcular precio total funciona
		//Añadir producto no funciona
	}

}
