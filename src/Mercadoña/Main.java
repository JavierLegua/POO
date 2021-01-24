package Mercadoña;

public class Main {

	public static void main(String[] args) {
		
		Producto vProductos[] = new Producto[10];
		
		vProductos[0] = new Perecedero("mayonesa", 2.99, 3);
		
		for (Producto p : vProductos) {
			if (p != null) {
				System.out.println(p.toString());
			}
		}

	}

}
