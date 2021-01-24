package Mercadoña;

public final class Perecedero extends Producto {
	
	protected static int DiasCaducar;
	
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		DiasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return DiasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		DiasCaducar = diasCaducar;
	}
	
	private static void Precio() {
		switch (DiasCaducar) {
		case 1: {
			precio -= precio*0.4;
			break;
		}
		case 2: {
			precio -= precio*0.3;
			break;
		}
		case 3: {
			precio -= precio*0.5;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + DiasCaducar);
		}
	}

	@Override
	public String toString() {
		return "Perecedero [DiasCaducar=" + DiasCaducar + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
	
}
