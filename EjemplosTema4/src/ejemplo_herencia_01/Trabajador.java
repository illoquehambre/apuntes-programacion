package ejemplo_herencia_01;

public class Trabajador {
	
	private String nombre;
	private String apellidos;
	private String puesto;
	public Trabajador(String nombre, String apellidos, String puesto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.puesto = puesto;
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
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellidos=" + apellidos + ", puesto=" + puesto + "]";
	}
	
	//metodos
	//mal ejemplo para como ahorrar calculos
	public double calcularPaga() {
	return (1200-1200*20/100)+35*23 ;
	}
}
