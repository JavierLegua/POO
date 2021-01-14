package EjercicioNocheVieja;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Entrada 23:50 String
		//Fin entrada 00:00
		//Salida 10
		
		String dato;
		Scanner leer = new Scanner(System.in);
		Tiempo vEntrada[] = new Tiempo[10];
		int cont=0;
		
		do {
			dato=leer.next();
			if(dato.equalsIgnoreCase("00:00")) {
				break;
			}
			vEntrada[cont] = new Tiempo(dato);
			if(vEntrada[cont].escorrecto()) {
				cont++;
			}
		}while(!dato.equalsIgnoreCase("00:00"));
		
		for(Tiempo t: vEntrada) {
			if(t!=null) {
				System.out.println();
			}else{
				break;
			}
		}
	}

}
