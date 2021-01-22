package Herencia;

public class Administrativo extends Personal {

	protected String cargo;

	public Administrativo(String nombre, int edad, String cargo) {
		super(nombre, edad);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return super.toString()+"[cargo=" + cargo + "]";
	}

}
