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
		Azucarada s = new Azucarada("5", 5, 9, "Fanta limon", 17, false);
		this.mEstanteria[0][0] = c;
		this.mEstanteria[2][2] = a;
		this.mEstanteria[2][3] = s;
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
	//No funciona
	public float calcularPrecioTotalMarca() {
		float precioTotal = 0;
		
		for (Bebidas[] bebidas : mEstanteria) {
			for (Bebidas bebida : bebidas) {
				if (bebida != null && bebida.getMarca().equals("Marca deseada.")) {
					precioTotal += bebida.getPrecio();
				}
			}
		}
		return precioTotal;
	}
	//Preguntar sobre este proceso
	public float calcularPrecioEstanteria() {
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
	
	public void añadirProducto() {
		Azucarada d = new Azucarada("5", 4, 1.1, "Fanta", 56, true);
		String codigo = d.getId();
		boolean aux = false, aux1 = false;
		
		for (Bebidas[] bebidas : mEstanteria) {
			for (Bebidas bebida : bebidas) {
				if (bebida != null && bebida.getId().equalsIgnoreCase(codigo)) {
					aux = true;
					System.out.println("Tu producto esta disponible.");
					break;
				}
			}
		}
		if (aux == false) {
			for (Bebidas[] bebidas : mEstanteria) {
				for (Bebidas bebida : bebidas) {
					if (bebida == null) {
						bebida = d;
						System.out.println("Tu producto ha sido añadido.");
						aux1 = true;
						break;
					}
				}
				if (aux1 == true) {
					break;
				}
			}
		}
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
