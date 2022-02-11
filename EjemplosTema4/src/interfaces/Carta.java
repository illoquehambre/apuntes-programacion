package interfaces;

public class Carta implements Imprimible{//aqui se declara que se implementa la interfaz

	private String cabecera;
	private String cuerpo;
	
	
	public Carta(String cabecera, String cuerpo) {
		super();
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
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


	@Override
	public void imprimirAst() {
		// TODO Auto-generated method stub
		System.out.println("******"+cabecera+"*******");
		System.out.println("******"+cuerpo+"*******");
	} 
	
	

}
