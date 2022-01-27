package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ganancia=0, descuento=0, seguro=0;
		Ordenador o=new Ordenador(800, "Toshiba","2 Tb", 175);
		Tablet t;
		Portatil p;
		
		System.out.println("Introduzca la ganancia deseada por el vendedor:");
		ganancia=Leer.datoDouble();
		System.out.println(o.calcularPrecioVenta(ganancia));
		
		System.out.println("Introduzca el precio del seguro de la tablet");
		seguro=Leer.datoDouble();
		t=new Tablet(800, "Toshiba","2 Tb", 175, seguro);
		System.out.println("Introduzca la ganancia deseada por el vendedor:");
		ganancia=Leer.datoDouble();
		System.out.println(t.calcularPrecioVenta(ganancia));
		
		
		System.out.println("Inttroduzca el descuento del portatil");
		descuento=Leer.datoDouble();
		p=new Portatil(800, "Toshiba","2 Tb", 175, descuento);
		System.out.println("Introduzca la ganancia deseada por el vendedor:");
		ganancia=Leer.datoDouble();
		System.out.println(p.calcularPrecioVenta(ganancia));
	}

}
