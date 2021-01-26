package GestionBebidas;

public abstract class Bebidas {

	protected String id;
	protected double litros;
	protected double precio;
	protected String marca;

	public Bebidas(String id, double litros, double precio, String marca) {
		this.id = id;
		this.litros = litros;
		this.precio = precio;
		this.marca = marca;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bebidas [id=" + id + ", litros=" + litros + ", precio=" + precio + ", marca=" + marca + "]";
	}

}
