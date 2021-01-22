package Herencia;

public class Main {

	public static void main(String[] args) {

		Alumno vAlumnos[] = new Alumno[10];

		vAlumnos[0] = new Alumno("Juan", 22, "Programacion");

		Personal vPersonal[] = new Personal[10];

		vPersonal[1] = new Alumno("Juan", 22, "1º DAW");
		vPersonal[0] = new Personal("Javier", 18);
		vPersonal[2] = new Profesor("Kasper", 65, "Entornos de desarrollo");
		vPersonal[3] = new Interino("Pedro", 30, "Profesor", "CArrera");
		vPersonal[4] = new Fijo("Pedrito", 35, "Profesor", "Profesor infantil");

		for (Personal p : vPersonal) {
			if (p != null) {
				System.out.println(p.toString());
			}
		}

	}

}
