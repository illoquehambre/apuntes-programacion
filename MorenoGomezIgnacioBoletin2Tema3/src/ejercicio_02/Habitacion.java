package ejercicio_02;

public class Habitacion {
	
	//atributos
	private int tipo;
	private double precioPorNoche[];
	private String nombreCliente;
	private int nDiasOcupada;
	private double serviciosExtra;
	
	//constructores
	public Habitacion(int tipo, double precioPorNoche[], String nombreCliente, int nDiasOcupada, double serviciosExtra) {
		super();
		this.tipo = tipo;
		this.precioPorNoche = precioPorNoche;
		this.nombreCliente = nombreCliente;
		this.nDiasOcupada = nDiasOcupada;
		this.serviciosExtra = serviciosExtra;
	}

		//getters && setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getnDiasOcupada() {
		return nDiasOcupada;
	}

	public void setnDiasOcupada(int nDiasOcupada) {
		this.nDiasOcupada = nDiasOcupada;
	}

	public double getServiciosExtra() {
		return serviciosExtra;
	}

	public void setServiciosExtra(double serviciosExtra) {
		this.serviciosExtra = serviciosExtra;
	}

	public double[] getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double[] precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}



	
}
