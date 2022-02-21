package ejercicio;

public class Inmobiliaria {
	
	/**
	 * @author moreno.goign22
	 * Clase Inmobiliaria que gestiona sus distintos pisos
	 * guardados en un atributo 'lista' array de pisos
	 *  y los métodos que se realizan con estos
	 *  @param maxDineroRecaudable Indica la cnatida de dinero recaudable si se vendiesen todos los pisos en ese momento en la lista
	 */
	
	
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
	/**
	 * Este método se encargará de generar un nuevo piso con los atributos indicado
	 * y añadirlo al array 'lista' que es atributo de la clase 'inmobiliaria'
	 * Atributos de cada uno de los pisos que se añaden al atributo de la clase inmobiliaria, array de pisos.
	 * @param direccion dirección del piso
	 * @param reformable indicador de si el piso está disponible para reforma
	 * @param precio precio base del piso
	 * @param metrosCuadrados superficie del piso en metros cuadrados
	 * @param contador indicará el número de pisos guardados en el array, y servirá para saber en que posición guardar el próximo
	 * Tras añadir el piso a la lista, se guardará en una variable estática, el dinero recaudable
	 *  si se vendiesen todos los pisos de la lista
	 */
	public void agregarNuevoPiso(Piso aux, int contador ) {//Pasar un piso completo, no atributos sueltos del mismo
		lista[contador]=aux;
		maxDineroRecaudable=maxDineroRecaudable+lista[contador].getPrecioBase();
	}
	/**
	 * Este método se encargará de calcular y devolver el precio con descuento de un piso concreto
	 * Se le pasará un número identificativo 'id' y el descuento a aplicar
	 * @param id número entero identificador
	 * @param porcentajeDescuento Desscuento aplicable al producto
	 * @return precio con descunto ya aplicado de un piso concreto 
	 */
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
