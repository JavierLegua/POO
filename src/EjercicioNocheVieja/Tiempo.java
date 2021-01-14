package EjercicioNocheVieja;

public class Tiempo {

	private int horas;
	private int minutos;
	private final int MINUTOS_DIA = 1440;

	//Dato con formato XX:XX
	public Tiempo(String dato) {
		String hora, minutos;
		try {
			hora = dato.substring(0, 2);
			minutos = dato.substring(3);
			this.horas = Integer.parseInt(hora);
			this.minutos = Integer.parseInt(minutos);
		}catch (Exception e) {
			System.out.println("Error en el formato");
			this.horas = 0;
			this.minutos = 0;
		}
		
		
	}
	
	public int minutosDiferencia() {
		int minutosTotales = horas * 60 + minutos;
		
		return MINUTOS_DIA - minutosTotales;
	}
	
	public boolean escorrecto() {
		if (horas!)
	}
}
