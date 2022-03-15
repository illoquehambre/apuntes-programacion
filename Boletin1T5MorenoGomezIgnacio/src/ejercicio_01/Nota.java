package ejercicio_01;

public class Nota {
	
	private int id;
	private String cabecera;
	private String cuerpo;
	private boolean urgente;
	
	                                     
	public Nota(int id, String cabecera, String cuerpo, boolean urgente) {
		super();
		this.id = id;
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
		this.urgente = urgente;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCabecera() {
		return cabecera;
	}
	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public boolean isUrgente() {
		return urgente;
	}
	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}
	
	
	@Override
	public String toString() {
		return "Nota [id=" + id + ", cabecera=" + cabecera + ", cuerpo=" + cuerpo + ", urgente=" + urgente + "]";
	}
	
	
	
	
	
}
