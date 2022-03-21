package sortedMap;

import java.util.Objects;

public class Jugador {
	private String nombre;
	private String apellidos;
	private int edad;
	private double sueldoBase;
	private String rol;

	// Constructor
	public Jugador(String nombre, String apellidos, int edad, double sueldoBase, String rol) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sueldoBase = sueldoBase;
		this.rol = rol;
	}

	// Getters & Setters
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	// To String
	@Override
	public String toString() {
		return "\nJugador\nNombre:" + nombre + "\nApellidos:" + apellidos + "\tEdad:" + edad + "\tSueldo base:"
				+ sueldoBase + "\tRol:" + rol;
	}

	// hashCode & equals
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, nombre, rol, sueldoBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Objects.equals(rol, other.rol)
				&& Double.doubleToLongBits(sueldoBase) == Double.doubleToLongBits(other.sueldoBase);
	}

}
