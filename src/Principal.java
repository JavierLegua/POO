
public class Principal {

	public static void main(String[] args) {

		Perro p = new Perro();
		Perro p2 = new Perro("Juan", 5);
		Perro p3 = new Perro("Juan", 500, 10);
		Perro pdi = new Perro("León", 7);

		Perro vPerros[] = new Perro[10];

		vPerros[0] = p;
		vPerros[1] = new Perro("Juan", 500, 10);
		vPerros[2] = new Perro("Juan", 501, 10);
		vPerros[3] = new Perro("Juan", 502, 10);

		for (int i = 0; i < vPerros.length; i++) {
			if (vPerros[i] != null && vPerros[i].comprobarChip()) {
				System.out.println(vPerros[i].toString());
			}

		}

	}

}
