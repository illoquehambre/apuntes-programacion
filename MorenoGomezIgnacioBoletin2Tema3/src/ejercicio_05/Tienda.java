package ejercicio_05;

public class Tienda {
	
	//atributos
	Electrodomestico lista[];

	public Tienda(Electrodomestico[] lista) {
		super();
		this.lista = lista;
	}

	public Electrodomestico[] getLista() {
		return lista;
	}

	public void setLista(Electrodomestico[] lista) {
		this.lista = lista;
	}
	
	
	
	//metodos
	public double calcularPrecioConcreto(int posicion) {
		return lista[posicion].calcularPrecioFinal();
	}
	
	public double calcularPrecioTotal () {
		double precio=0;
		for(int i=0;i<lista.length;i++) {
			precio=precio+lista[i].calcularPrecioFinal();
		}
		return precio;
	}
	
	public double calcularMedia() {
		return this.calcularPrecioTotal()/lista.length;			
	}
}
