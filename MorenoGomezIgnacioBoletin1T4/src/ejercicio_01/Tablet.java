package ejercicio_01;

public class Tablet extends Ordenador{
	
	private double precioSeguro;

	public Tablet(double precioBase, String marca, String discoDuro, int frecuenciaProcesador, double precioSeguro) {
		super(precioBase, marca, discoDuro, frecuenciaProcesador);
		this.precioSeguro = precioSeguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString() +"Tablet [precioSeguro=" + precioSeguro + ", toString()=" +  "]";
	}
	//metodos
	public double calcularPrecioVenta(double ganancia) {
		return super.calcularPrecioVenta(ganancia) + precioSeguro;
	}
}
