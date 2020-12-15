import java.util.Scanner;

public class Explicacion_ControlErrores {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int opc=0;
		
		do {
		System.out.println("1-Dime un numero");
		System.out.println("2-Dime un numero");
		System.out.println("Dime un numero");
		try {
			opc=leer.nextInt();
		} catch (Exception e) {
			System.out.println("Error al leer, tienes que escribir un número");
			leer = new Scanner(System.in);
		}
		
		}while(opc < 1 || opc > 2);
			

	}

}
