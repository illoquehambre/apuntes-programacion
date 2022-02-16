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
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + ", getPrecioBase()=" + getPrecioBase()
				+ ", getCliente()=" + getCliente() + ", isOcupacion()=" + isOcupacion() + ", getnDias()=" + getnDias()
				+ ", getnOcupantes()=" + getnOcupantes() + ", toString()=" + super.toString()
				+ ", calcularPrecioFinal()=" + calcularPrecioFinal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	public double calcularServicioLimpieza(double precio) {
		// TODO Apéndice de método generado automáticamente
		if(servicioLimpieza) {
			return  precio;
		}else {
			return 0; 
		}
		
	}
	
	public double calcularPrecioFinal(double precio) {
		return super.calcularPrecioFinal()+this.calcularServicioLimpieza(precio)
	}
	

}
