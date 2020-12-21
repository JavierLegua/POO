package generarContraseña;

public class PrincipalContraseña {

	public static void main(String[] args) {
		
		Contraseña c = new Contraseña();
		System.out.println(c.getContrasena());
        System.out.println(c.esFuerte());

	}

}
