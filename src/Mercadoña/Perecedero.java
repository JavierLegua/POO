package Mercadoña;

public final class Perecedero extends Producto {
	
	private int dias;

	public Perecedero(String nombre, float precio, int dias) {
		super(nombre, precio);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return super.toString() + " Perecedero [dias=" + dias + "]";
	}

	@Override
	public float calcular(int cantidad) {
	//	float precioFinal = super.calcular(cantidad);
		float precioFinal = cantidad * precio;
		switch (dias) {
		case 1:
			precioFinal /= 4;
			break;

		case 2:
			precioFinal = precioFinal/3;
			break;

		case 3:
			precioFinal = precioFinal/2;
			break;

		}
		
		return precioFinal;
	}
	
	
	
}
