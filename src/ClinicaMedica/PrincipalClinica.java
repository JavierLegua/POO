package ClinicaMedica;

import java.util.Scanner;

public class PrincipalClinica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Persona p = new Persona("juan", "75110020-M", 20, 'H', 50, 1.50);
				//System.out.println(p.generarDNI());
				Persona p2 = new Persona();
				if (p.equals(p2)) {
					System.out.println("Son la misma persona");
				}else {
					System.out.println("No son la misma persona");
				}
				//System.out.println(p2.toString());
				
			
				
			}

}
