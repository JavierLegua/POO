package Mercadoña;

public class Producto extends PrincipalMercadoña {
	
	protected String nombre;
	protected float precio;
	
	public Producto(Producto p) {
		this.nombre = p.nombre;
		this.precio = p.precio;
	}
	
	public Producto(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	protected float calcular(int cantidad) {
		return precio*cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}	
	
	
	
}
