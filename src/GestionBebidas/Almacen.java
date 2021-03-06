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

	public float calcularPrecioTotalMarca(String buscar) {
		float precioTotal = 0;
		
		for (Bebidas[] bebidas : mEstanteria) {
			for (Bebidas bebida : bebidas) {
				if (bebida != null && bebida.getMarca().equals(buscar)) {
					precioTotal += bebida.getPrecio();
				}
			}
		}
		return precioTotal;
	}
	
	public float calcularPrecioEstanteria(int estanteria) {
		float precioTotal = 0;
		
		for (int i = 0; i < mEstanteria.length; i++) {
			if (mEstanteria[i][estanteria] != null) {
				precioTotal += mEstanteria[i][estanteria].getPrecio();
			}
		}
		
		return precioTotal;
	}
	//Corregir Mañana
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
		if(aux == false) {
		     for (int i = 0; i < mEstanteria.length; i++) {
		         for (int j = 0; j < mEstanteria.length; j++) {
		             if (mEstanteria[i][j] == null) {
		                 mEstanteria[i][j] = d;
		                 System.out.println("Producto añadido");
		                 aux1 = true;
		                 break;
		             }
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
