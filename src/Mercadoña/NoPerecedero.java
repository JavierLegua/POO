package Mercadoña;

public final class NoPerecedero extends Producto {

	protected String tipo;

	public NoPerecedero(String nombre, int precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
