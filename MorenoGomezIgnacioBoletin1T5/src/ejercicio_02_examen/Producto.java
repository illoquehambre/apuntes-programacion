package ejercicio_02_examen;

public abstract class Producto implements Comparable<Producto>{
	
	private String nombre;
	private double precioBase;	
	
	
	public Producto(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + "]";
	}

	@Override
	public int compareTo(Producto o) {
		int aux=0;
		// TODO Apéndice de método generado automáticamente
		if(o.getPrecioBase()<precioBase) {
			aux=1;
		}else if(o.getPrecioBase()>precioBase) {
			aux=-1;
		}else {
			aux=0;
		}
		return aux;
	} 
	
	
	
	
}
