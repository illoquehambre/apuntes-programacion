package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carta c=new Carta("Salesianos Triana", "Estimados alumnos...");
		PaginaWeb pg= new PaginaWeb("Salesianos Triana", "Buenos dias");
		
		
		c.imprimirAst();
		System.out.println();
		pg.imprimirAst();
	}

}
