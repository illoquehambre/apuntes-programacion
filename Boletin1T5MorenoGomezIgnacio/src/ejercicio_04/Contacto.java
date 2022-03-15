package ejercicio_04;

public class Contacto {
	
	private String nombre;
	private String direccion;
	
	
	public Contacto(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
}
