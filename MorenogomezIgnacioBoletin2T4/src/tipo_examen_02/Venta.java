package tipo_examen_02;

import java.util.Arrays;
import java.util.Iterator;

public class Venta {
	
	private Producto[] lista;
	private double totalRecaudado;

	public Venta(Producto[] lista) {
		super();
		this.lista = lista;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public int totalProductosRestantes(int contador){
		int total=0;
		for(int i=0;i<contador;i++) {
			total=total+lista[i].getnUnidades();
		}
		
		return total;
	}
	
	public void restarUno(int posicion) {
		lista[posicion].setnUnidades(lista[posicion].getnUnidades()-1);
	}
	public double devolverCambio(double porcGanan, double dineroEntregado, int posicion, double cantFij){
		
		if(dineroEntregado>=lista[posicion].calculaPVP(porcGanan, cantFij)) {
			restarUno(posicion);
			return lista[posicion].calculaPVP(porcGanan, cantFij)-dineroEntregado;
		}else {
			this.dineroInsuficiente();
			return dineroEntregado;
		}
		
	}
	
	public void dineroInsuficiente() {
		System.out.println("El dinero introducido no es suficiente");
	}
	
	public void mostrarProductos(int posicion){
		for(int i=0;i<posicion;i++) {
			System.out.println(lista[posicion]);
		}
	}
	
}
