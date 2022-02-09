package ejercicio_05;

public class Empleado {
	
	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private double totalVentas;
	private int id;
	
	
	public Empleado(String nombre, String apellidos, double sueldoBase, double totalVentas, int id) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = 1000 ;
		this.totalVentas = totalVentas;
		this.id = id;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase
				+ ", totalVentas=" + totalVentas + ", id=" + id + "]";
	}
	
	public double calcularSueldo (){
		return sueldoBase;
	}
}
