package ejercicio_03;

public class Furgo extends VehiculoMotor{
	
	private static double impuestosExtra;

	public Furgo(double potencia, int cilindrada, String tipoCombustible, int idTipo) {
		super(potencia, cilindrada, tipoCombustible, idTipo);
		setImpuestosExtra(200);
		// TODO Auto-generated constructor stub
	}

	public static double getImpuestosExtra() {
		return impuestosExtra;
	}

	public static void setImpuestosExtra(double impuestosExtra) {
		Furgo.impuestosExtra = impuestosExtra;
	}

	@Override
	public String toString() {
		return "Tipo= Furgo \n" + super.toString();
	}
	
	public double calcularImpuestos() {
		return super.calcularImpuestos()+impuestosExtra;
	}
	
}
