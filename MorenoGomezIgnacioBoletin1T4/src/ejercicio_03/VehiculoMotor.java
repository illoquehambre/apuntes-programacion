package ejercicio_03;

public class VehiculoMotor {
	
	private int idTipo;
	private double Potencia;
	private int cilindrada;
	private String tipoCombustible;
	private static double impuestosBase;
	public VehiculoMotor(double potencia, int cilindrada, String tipoCombustible, int idTipo) {
		super();
		Potencia = potencia;
		this.cilindrada = cilindrada;
		this.tipoCombustible = tipoCombustible;
		this.idTipo=idTipo;
		VehiculoMotor.impuestosBase=400;
	}
	public double getPotencia() {
		return Potencia;
	}
	public void setPotencia(double potencia) {
		Potencia = potencia;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	
	public static double getImpuestosBase() {
		return impuestosBase;
	}
	public static void setImpuestosBase(double impuestosBase) {
		VehiculoMotor.impuestosBase = impuestosBase;
	}
	
	@Override
	public String toString() {
		return "VehiculoMotor [Potencia=" + Potencia + ", cilindrada=" + cilindrada + ", tipoCombustible="
				+ tipoCombustible + "]";
	}
	 
	
	
	
	//metodos
	public double calcularImpuestos(){
		return impuestosBase;
	}
	
}
