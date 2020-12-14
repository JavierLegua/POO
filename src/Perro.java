
public class Perro {

	private String nombre;
	private int edad;
	private boolean vacunado;

	public Perro() {
		this.nombre = "";
		this.edad = 0;
		this.vacunado = false;
	}

	public Perro(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		this.vacunado = false;
	}

	public Perro(String nombre, int edad, boolean vacunado) {
		this.nombre = nombre;
		this.edad = edad;
		this.vacunado = vacunado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String isVacunado() {
		String vacu;
		if (vacunado == false) {
			vacu = "No estoy vacunado";
		} else {
			vacu = "Estoy vacunado";
		}
		return vacu;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public void cumpleAnos() {
		if (edad > 15) {
			System.out.println("Adios chauchau");
		} else {
			edad++;
		}
	}

	public void ponerVacuna() {
		if (vacunado == false) {
			vacunado = true;
		} else {
			System.out.println("Ya tengo una vacuna!");
		}
	}

	@Override
	public String toString() {
		String perro = "";

		perro = nombre + "\n" + edad + "\n" + isVacunado();
		return perro;
	}

}
