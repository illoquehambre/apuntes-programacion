package ejercicio;

public class Piso {
	
	private String direccion;
	private double precioBase;
	private double metrosCuadrados;
	private boolean necesitaReforma;
	
	public Piso(String direccion, double precioBase, double metrosCuadrados, boolean necesitaReforma) {
		super();
		this.direccion = direccion;
		this.precioBase = precioBase;
		this.metrosCuadrados = metrosCuadrados;
		this.necesitaReforma = necesitaReforma;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public boolean isNecesitaReforma() {
		return necesitaReforma;
	}
	public void setNecesitaReforma(boolean necesitaReforma) {
		this.necesitaReforma = necesitaReforma;
	}
	
	//metodos
	public double calcularPrecioMetroCuadrado() {
		return precioBase/metrosCuadrados;
		
	}
}
