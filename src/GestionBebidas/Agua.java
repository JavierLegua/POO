package GestionBebidas;

public final class Agua extends Bebidas {

	private String origen;

	public Agua(String id, double litros, double precio, String marca,
			String origen) {
		super(id, litros, precio, marca);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public double getPrecio() {
		return super.getPrecio();
	}
	
	@Override
	public String toString() {
		return "Agua [origen=" + origen + ", id=" + id + ", litros=" + litros + ", precio=" + precio + ", marca="
				+ marca + "]";
	}

}
