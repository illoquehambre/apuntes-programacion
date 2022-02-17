package tipo_examen_02;

public abstract class Producto {
	
	private double precioBase;
	private int nUnidades;
	private String nombre;
	
	
	public Producto(double precioBase, int nUnidades, String nombre) {
		super();
		this.precioBase = precioBase;
		this.nUnidades = nUnidades;
		this.nombre = nombre;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public int getnUnidades() {
		return nUnidades;
	}


	public void setnUnidades(int nUnidades) {
		this.nUnidades = nUnidades;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", nUnidades=" + nUnidades + ", nombre=" + nombre + "]";
	}
	
	public abstract double calculaPVP(double porcGanan, double cantFij);//calcula el precio de venta al público
		
	
}
