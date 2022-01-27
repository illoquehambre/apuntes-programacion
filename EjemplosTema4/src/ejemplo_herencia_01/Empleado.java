package ejemplo_herencia_01;

public class Empleado extends Trabajador{
	
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String apellidos, String puesto, double sueldo, double impuestos) {
		super(nombre, apellidos, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	
	@Override
	public String toString() {
		return super.toString() +"Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", toString()=" +  "]";
	}

	public double calcularPaga() {
		int porcentaje=100;
		return super.calcularPaga()+ sueldo-(sueldo*impuestos/porcentaje);
	}
}
