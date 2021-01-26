package GestionBebidas;

import java.util.Arrays;

public class Almacen {

	private String nombre;
	private Bebidas mEstanteria[][];

	public Almacen(String nombre) {
		super();
		this.nombre = nombre;
		this.mEstanteria = new Bebidas[5][5];
		Azucarada c = new Azucarada("2", 2, 4, "Fanta", 15, true);
		Azucarada a = new Azucarada("3", 5, 9, "Fanta naranja", 17, false);
		this.mEstanteria[0][0] = c;
		this.mEstanteria[2][2] = a;
	}
	
	public float calcularPrecioTotal() {
		float precioTotal = 0;
		
		for (Bebidas[] bebidas : mEstanteria) {
			for (Bebidas bebida : bebidas) {
				if (bebida != null) {
					precioTotal += bebida.getPrecio();
				}
			}
		}
		return precioTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", mEstanteria=" + Arrays.toString(mEstanteria) + "]";
	}

}
