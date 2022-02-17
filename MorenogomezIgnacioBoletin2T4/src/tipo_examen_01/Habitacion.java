package tipo_examen_01;

public class Habitacion {
	
	private double precioBase;
	private String cliente;
	private boolean ocupacion;
	private int nDias;
	private int nOcupantes;
	public Habitacion(double precioBase, String cliente, boolean ocupacion, int nDias, int nOcupantes) {
		super();
		this.precioBase = precioBase;
		this.cliente = cliente;
		this.ocupacion = ocupacion;
		this.nDias = nDias;
		this.nOcupantes = nOcupantes;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public boolean isOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(boolean ocupacion) {
		this.ocupacion = ocupacion;
	}
	public int getnDias() {
		return nDias;
	}
	public void setnDias(int nDias) {
		this.nDias = nDias;
	}
	public int getnOcupantes() {
		return nOcupantes;
	}
	public void setnOcupantes(int nOcupantes) {
		this.nOcupantes = nOcupantes;
	}
	
	
	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", cliente=" + cliente + ", ocupacion=" + ocupacion + ", nDias="
				+ nDias + ", nOcupantes=" + nOcupantes + "]";
	}
	
	public double calcularPrecioFinal(double p, double p2) {
		return precioBase*nDias;
	}
	
	
	
}
