package tipo_examen_02;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int contador=0, id=0;
		double porcGanan=20, dinero=0, cantfij=10;
		Producto[] lista= new Producto[10];
		Venta v=new Venta(lista);
		
		
		lista[0]=new EspadaLaser(500, 25, null, null, null);
		v.devolverCambio(porcGanan, dinero, id, cantfij);
		
		
	}

}
