package tipo_examen_01;

public class Suite extends Habitacion implements DescuentoRealizable{

		private double metrosCuadrados;
		private double serviciosExtra;
		
		
		public Suite(double precioBase, String cliente, boolean ocupacion, int nDias, int nOcupantes,
				double metrosCuadrados, double serviciosExtra) {
			super(precioBase, cliente, ocupacion, nDias, nOcupantes);
			this.metrosCuadrados = metrosCuadrados;
			this.serviciosExtra = serviciosExtra;
		}


		public double getMetrosCuadrados() {
			return metrosCuadrados;
		}


		public void setMetrosCuadrados(double metrosCuadrados) {
			this.metrosCuadrados = metrosCuadrados;
		}


		public double getServiciosExtra() {
			return serviciosExtra;
		}


		public void setServiciosExtra(double serviciosExtra) {
			this.serviciosExtra = serviciosExtra;
		}


		@Override
		public String toString() {
			return "Suite [metrosCuadrados=" + metrosCuadrados + ", serviciosExtra=" + serviciosExtra
					+ ", getPrecioBase()=" + getPrecioBase() + ", getCliente()=" + getCliente() + ", isOcupacion()="
					+ isOcupacion() + ", getnDias()=" + getnDias() + ", getnOcupantes()=" + getnOcupantes()
					+ ", toString()=" + super.toString() + ", calcularPrecioFinal()=" + calcularPrecioFinal()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}
		
		
		@Override
		public double calcularDescuento(double descuento) {
			// TODO Apéndice de método generado automáticamente
			int divisor=100;
			return (super.calcularPrecioFinal()/100)*20;
		}
		
		
		public double calcularPrecioFinal(double descuento) {
			 return super.calcularPrecioFinal()+serviciosExtra-this.calcularDescuento(descuento);
		}


	
}
