package ejercicio_02_examen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int opcion=0;
	
		Map <Producto, Integer> linea=new HashMap<Producto, Integer>();
		Venta auxVenta=new Venta(linea);
		Set <Venta> vent =new HashSet<Venta>();
		Registro registro=new Registro(vent);
		
		
		auxVenta.getLinea().put(new EspadasLaser("manolo", 24580, "rojo"), 1);
		auxVenta.getLinea().put(new EspadasLaser("francisco", 416544, "morao"), 7);
		auxVenta.getLinea().put(new EspadasLaser("usimo", 999999, "negro"), 4);
		auxVenta.getLinea().put(new Movil("arturo", 199, "baduba"), 3);
		auxVenta.getLinea().put(new Movil("alakasuma", 9999, "motorolalala"), 12);
		
		
		
		
		registro.getLista().add(auxVenta);
		
		
		
	}

}
