package ejercicio_05;

import java.util.Objects;

public class Persona implements Comparable<Persona>{//Comparable va en la pojo porque es el orden natural
	
	private String nombre;
	private String direccion;
	private String telefono;
	public Persona(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(direccion, nombre, telefono);
	}
	@Override
	public boolean equals(Object obj) {//El equals viene bien autogenerarlo, pero no lo vamos a tocar
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return telefono.compareToIgnoreCase(o.telefono);
	}
	
	
	
}
