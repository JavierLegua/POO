package FicheroVentas;

public class Main {

	public static void main(String[] args) {

		Ventas[] vVentas;

		/*
		 * vVentas[0] = new Ventas("Javier", 4, 5, 5);
		 * vVentas[1] = new Ventas("Pedro",4, 5, 5);
		 * vVentas[2] = new Ventas("Juan", 4, 5, 5);
		 * vVentas[3] = new Ventas("Pepe", 4, 5, 5);
		 */

		// IODatos.guardarDatos("ventas.dat", vVentas);

		vVentas = IODatos.cargarDatos("ventas.dat");

		int total = calcularTotal(vVentas, "Juan");
		System.out.println(total);
		
		System.out.println(contarClientes(vVentas));
	}

	private static int calcularTotal(Ventas[] vVentas, String cliente) {

		int suma = 0;

		for (Ventas ventas : vVentas) {
			if (ventas != null && cliente.equalsIgnoreCase(ventas.getCliente())) {
				suma += ventas.getPrecio() * ventas.getUniVendidas();
			}
		}

		return suma;
	}

	private static int contarClientes(Ventas[] vVentas) {

		int total = 0;
		String[] vClientes = new String[vVentas.length];

		for (Ventas v : vVentas) {
			if (v != null) {
				for (int i = 0; i < vClientes.length; i++) {
					if (vClientes[i] != null) {
						if (v.getCliente().equalsIgnoreCase(vClientes[i])) {
							break;
						}
					} else {
						total++;
						vClientes[i] = v.getCliente();
						break;
					}
				}
			} else {
				break;
			}
		}

		return total;
	}

}
