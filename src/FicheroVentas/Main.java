package FicheroVentas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Ventas[] vVentas;
		
		/*vVentas[0] = new Ventas("Javier", 4, 5, 5);
		vVentas[1] = new Ventas("Pedro", 4, 5, 5);
		vVentas[2] = new Ventas("Juan", 4, 5, 5);
		vVentas[3] = new Ventas("Pepe", 4, 5, 5);*/
		
		//IODatos.guardarDatos("ventas.dat", vVentas);
		
		vVentas = IODatos.cargarDatos("ventas.dat");
	}
	
	
	private static int calcularTotal(Ventas[] vVentas, String cliente) {
		
		int suma = 0;
		
		for (Ventas ventas : vVentas) {
			if (cliente.equalsIgnoreCase(ventas.getCliente())) {
				suma += ventas.getPrecio()*ventas.getUniVendidas();
			}
		}
		
		return suma;
	}
	
	private static int contarClientes(Ventas[] vVentas, String cliente) {
		
		int total = 0;
		String clientes;
		
		for (Ventas ventas : vVentas) {
			if (ventas.getCliente().equalsIgnoreCase(cliente)) {
				total++;
			}
		}
		
		
		
		return total;
	}

}
