package ejercicio_04;

public class Cliente {

	//atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean actividad;
	private double peso;
	private double altura;
	
	public Cliente(String dni, String nombre, String apellidos, boolean actividad, double peso, double altura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.actividad = actividad;
		this.peso = peso;
		this.altura = altura;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public boolean isActividad() {
		return actividad;
	}

	public void setActividad(boolean actividad) {
		this.actividad = actividad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//métodos
	public double calcularIMC(){
		return peso/(Math.pow(altura, 2));
	}

	@Override
	public String toString() {
		if(actividad) {
			return "ACTIVO";
		}
		return "INACTIVO" ;
	}
	

}
