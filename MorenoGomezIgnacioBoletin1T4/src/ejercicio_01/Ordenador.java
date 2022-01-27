package ejercicio_01;

public class Ordenador {
	
	private double precioBase;
	private String marca;
	private String discoDuro;
	private int frecuenciaProcesador;
	public Ordenador(double precioBase, String marca, String discoDuro, int frecuenciaProcesador) {
		super();
		this.precioBase = precioBase;
		this.marca = marca;
		this.discoDuro = discoDuro;
		this.frecuenciaProcesador = frecuenciaProcesador;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(String discoDuro) {
		this.discoDuro = discoDuro;
	}
	public int getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}
	public void setFrecuenciaProcesador(int frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}
	@Override
	public String toString() {
		return "Ordenador [precioBase=" + precioBase + ", marca=" + marca + ", discoDuro=" + discoDuro
				+ ", frecuenciaProcesador=" + frecuenciaProcesador + "]";
	}
	
	
	//metodos
	public double calcularPrecioVenta(double ganancia) {
		double divisor=100;
		return precioBase+precioBase*ganancia/divisor;
	}
}
