package interfaces;

public class PaginaWeb implements Imprimible{

	private String titulo;
	private String contenido;
	
	
	public PaginaWeb(String titulo, String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	@Override
	public void imprimirAst() {
		// TODO Auto-generated method stub
		System.out.println("-------"+titulo+"--------");
		System.out.println("-------"+contenido+"--------");
	}
	
	

}
