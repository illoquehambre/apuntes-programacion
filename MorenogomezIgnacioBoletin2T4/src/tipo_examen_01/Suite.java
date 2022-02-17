package tipo_examen_01;

public class Suite extends Habitacion implements DescuentoRealizable, IRegalable{

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
			return "Suite [metrosCuadrados=" + metrosCuadrados + ", serviciosExtra=" + serviciosExtra + "]"+super.toString();
		}


		@Override
		public double calcularDescuento(double precio, double descuento) {
			// TODO Apéndice de método generado automáticamente
			int divisor=100;
			return (super.calcularPrecioFinal(precio, descuento)/divisor)*descuento;
		}
		
		
		public double calcularPrecioFinal(double precio, double descuento) {
			 return super.calcularPrecioFinal(precio, descuento)+serviciosExtra-this.calcularDescuento(precio, descuento);
		}


		@Override
		public void mostrarRegalo(double precioExtra) {
			// TODO Auto-generated method stub
			serviciosExtra=serviciosExtra+precioExtra;
			
		}


	

	
}
