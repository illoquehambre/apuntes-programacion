package ejercicio_02_examen;

import java.util.Map;

public class Venta {
	
	Map <Producto, Integer> linea;

	public Venta(Map<Producto, Integer> linea) {
		super();
		this.linea = linea;
	}

	public Map<Producto, Integer> getLinea() {
		return linea;
	}

	public void setLinea(Map<Producto, Integer> linea) {
		this.linea = linea;
	}

	@Override
	public String toString() {
		return "lineaDeVenta [linea=" + linea + "]";
	}
	
	
	
}
