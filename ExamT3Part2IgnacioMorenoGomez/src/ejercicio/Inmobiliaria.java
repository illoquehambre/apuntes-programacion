package ejercicio;

public class Inmobiliaria {
	
	private Piso lista[];
	private static double maxDineroRecaudable;
	
	public Inmobiliaria(Piso[] lista) {
		super();
		Inmobiliaria.maxDineroRecaudable=0;
		this.lista = lista;
	}
	
	public Piso[] getLista() {
		return lista;
	}
	public void setLista(Piso[] lista) {
		this.lista = lista;
	}
	public static double getMaxDineroRecaudable() {
		return maxDineroRecaudable;
	}
	public static void setMaxDineroRecaudable(double maxDineroRecaudable) {
		Inmobiliaria.maxDineroRecaudable = maxDineroRecaudable;
	}
	//metodos
	public void agregarNuevoPiso(String direccion, boolean reformable, double precio, double metrosCuadrados, int contador ) {//Pasar un piso completo, no atributos sueltos del mismo
		lista[contador]=new Piso(direccion, precio, metrosCuadrados, reformable);
		maxDineroRecaudable=maxDineroRecaudable+precio;
	}
	
	public double calcularPrecioDescuento(int id, double porcentajeDescuento) {
		int tantoPorCiento=100;
		return lista[id].getPrecioBase()-(lista[id].getPrecioBase()*(porcentajeDescuento/tantoPorCiento));
	}
	public double calcularMetroCuadradoEnDolares(double valorCambio, int id) {
		return lista[id].calcularPrecioMetroCuadrado()*valorCambio;
	}
	
	public double calcularGanancias(int id, double porcentajeGanancias) {
		int tantoPorCiento=100;
		return lista[id].getPrecioBase()*(porcentajeGanancias/tantoPorCiento);
	}
	
	public double calcularMaxGanaciasPosible(double porcentajeGanancias) {
		int tantoPorCiento=100;
		return maxDineroRecaudable*(porcentajeGanancias/tantoPorCiento);
	}
	
	public void mostrarNoReformables(int pisosCreados) {
		System.out.println("\tDIRECCION\t\tPRECIO BASE\tMETROS CUADRADOS\n");
		for(int i=0;i<pisosCreados;i++) {
			if(!lista[i].isNecesitaReforma()) {
				System.out.println("\t"+lista[i].getDireccion()+"\t\t"+lista[i].getPrecioBase()+"\t\t"+lista[i].getMetrosCuadrados());
			}
		}
	}
	
}
