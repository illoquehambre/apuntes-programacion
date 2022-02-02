package ejercicio_03;

public class Moto extends VehiculoMotor {

		private static double porcentajePotenciaImpuestos;

		
		public Moto(double potencia, int cilindrada, String tipoCombustible, int idTipo) {
			super(potencia, cilindrada, tipoCombustible, idTipo);
			Moto.porcentajePotenciaImpuestos=60;
			// TODO Auto-generated constructor stub
		}


		public static double getPorcentajePotenciaImpuestos() {
			return porcentajePotenciaImpuestos;
		}


		public static void setPorcentajePotenciaImpuestos(double porcentajePotenciaImpuestos) {
			Moto.porcentajePotenciaImpuestos = porcentajePotenciaImpuestos;
		}


		@Override
		public String toString() {
			return "Tipo= Moto \n" + super.toString();
		}	
		
		public double calcularImpuestos(){
			double divisor=100;
			return super.calcularImpuestos()+getPotencia()*(porcentajePotenciaImpuestos/divisor);
		}
		
}
