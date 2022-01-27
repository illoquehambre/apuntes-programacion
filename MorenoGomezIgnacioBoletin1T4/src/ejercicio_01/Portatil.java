package ejercicio_01;

public class Portatil extends Ordenador{
	
	private double descuentaOferta;

	public Portatil(double precioBase, String marca, String discoDuro, int frecuenciaProcesador,
			double descuentaOferta) {
		super(precioBase, marca, discoDuro, frecuenciaProcesador);
		this.descuentaOferta = descuentaOferta;
	}

	public double getDescuentaOferta() {
		return descuentaOferta;
	}

	public void setDescuentaOferta(double descuentaOferta) {
		this.descuentaOferta = descuentaOferta;
	}

	@Override
	public String toString() {
		return super.toString() +"Portatil [descuentaOferta=" + descuentaOferta + ", toString()=" +  "]";
	}
	
	
	//metodos
	public double calcularPrecioVenta(double ganancia) {
		return super.calcularPrecioVenta(ganancia) - (descuentaOferta*super.calcularPrecioVenta(ganancia)/100);
		
	}
} 
