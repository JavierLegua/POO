
public class Gato {

	private String nombre;
	private int vidas;
	private int numPatas;

	public Gato() {
		this.nombre = "";
		vidas = 7;
		numPatas = 4;
	}

	public Gato(String nombre) {
		this.nombre = nombre;
		vidas = 1;
		numPatas = 4;
	}

	public Gato(String nombre, int vidas, int numPatas) {
		this.nombre = nombre;
		this.vidas = vidas;
		this.numPatas = numPatas;
	}

	public void gritar() {
		System.out.println("Miauuuuuu");
	}

	public void matar() {
		if (vidas > 0) {
			vidas--;
		} else {
			System.out.println("El gato no tiene vidas");
		}

		if (vidas <= 0) {
			System.out.println("DEP -- " + nombre);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return nombre + ", vidas=" + vidas + ", numPatas=" + numPatas;
	}

}
