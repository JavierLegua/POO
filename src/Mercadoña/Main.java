package Mercadoña;

public class Main {

	public static void main(String[] args) {
		
		Producto p[][] = new Producto[10][10];
		
		p[0][0] = new Producto("Caramelo", 10);
		p[4][0] = new Producto("Caramelo1", 10);
		p[2][3] = new Producto("Caramelo2", 10);
		
		for (Producto[] fila : p) {
			for(Producto producto: fila) {
				if (producto!=null)
					System.out.println(producto.toString());
			}
		}

	}

}
