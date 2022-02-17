package tipo_examen_01;

public class Apartamento extends Habitacion implements ServicioLimpieza{
	
	private boolean servicioLimpieza;

	public Apartamento(double precioBase, String cliente, boolean ocupacion, int nDias, int nOcupantes,
			boolean servicioLimpieza) {
		super(precioBase, cliente, ocupacion, nDias, nOcupantes);
		this.servicioLimpieza = servicioLimpieza;
	}

	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}


	

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + "]"+super.toString();
	}

	@Override
	public double calcularServicioLimpieza(double precio) {
		// TODO Apéndice de método generado automáticamente
		if(servicioLimpieza) {
			return  precio*getnDias();
		}else {
			return 0; 
		}
		
	}
	
	public double calcularPrecioFinal(double precio, double descuento) {
		return super.calcularPrecioFinal(precio, descuento)+this.calcularServicioLimpieza(precio);
	}
	

}
