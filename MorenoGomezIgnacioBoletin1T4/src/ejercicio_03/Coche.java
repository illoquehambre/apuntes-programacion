package ejercicio_03;

public class Coche extends VehiculoMotor{
	
	private static double porcentajeImpuestosCilindrada;

	public Coche(double potencia, int cilindrada, String tipoCombustible, int idTipo) {
		super(potencia, cilindrada, tipoCombustible, idTipo);
		porcentajeImpuestosCilindrada=25;
		// TODO Auto-generated constructor stub
	}

	public static double getPorcentajeImpuestosCilindrada() {
		return porcentajeImpuestosCilindrada;
	}

	public static void setPorcentajeImpuestosCilindrada(double porcentajeImpuestosCilindrada) {
		Coche.porcentajeImpuestosCilindrada = porcentajeImpuestosCilindrada;
	}

	@Override
	public String toString() {
		return "Tipo=Coche \n"+ super.toString();
	}
	
	public double calcularImpuestos() {
		double divisor=100;
		return super.calcularImpuestos()+getCilindrada()*(porcentajeImpuestosCilindrada/divisor);
	}

}
