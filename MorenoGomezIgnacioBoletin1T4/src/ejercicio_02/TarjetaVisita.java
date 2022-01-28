package ejercicio_02;

public class TarjetaVisita extends Documento{
	
	private String nombre;
	private String apellidos;
	private String numeroTelefono;
	private String correo;
	public TarjetaVisita(String encabezado, String nombre, String apellidos, String numeroTelefono, String correo) {
		super(encabezado);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numeroTelefono = numeroTelefono;
		this.correo = correo;
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
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return super.toString() +"\n- " + nombre + "\n- " + apellidos + "\n- " + numeroTelefono
				+ "\n- " + correo ;
	}
}
