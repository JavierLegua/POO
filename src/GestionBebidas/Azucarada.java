package GestionBebidas;

public final class Azucarada extends Bebidas {

	private double azucar;
	private boolean promocion;

	public Azucarada(String id, double litros, double precio, String marca, double azucar, boolean promocion) {
		super(id, litros, precio, marca);
		this.azucar = azucar;
		this.promocion = promocion;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	@Override
	public double getPrecio() {
		if (promocion) {
			return super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
		
	}
	
	@Override
	public String toString() {
		return "Azucarada [azucar=" + azucar + ", promocion=" + promocion + ", id=" + id + ", litros=" + litros
				+ ", precio=" + precio + ", marca=" + marca + "]";
	}

}
