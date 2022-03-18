package ejercicio_06;

import java.util.Objects;

public class Trabajador {
	public String nombre;
	public String dni;
	public int horasTrabajadas;
	public double sueldoFinal;
	public Trabajador(String nombre, String dni, int horasTrabajadas, double sueldoFinal) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getSueldoFinal() {
		return sueldoFinal;
	}
	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas=" + horasTrabajadas
				+ ", sueldoFinal=" + sueldoFinal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, horasTrabajadas, nombre, sueldoFinal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(dni, other.dni) && horasTrabajadas == other.horasTrabajadas
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldoFinal) == Double.doubleToLongBits(other.sueldoFinal);
	}
	
	
}
