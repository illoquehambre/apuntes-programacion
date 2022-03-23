package hasmap_to_treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Integer> mapa1 = new HashMap();
		mapa1.put("nbbvibreuv", 66342);
		mapa1.put("wvrwvrw", 662);
		mapa1.put("nbbrqebht4hbvibreuv", 54);
		mapa1.put("dgsasgsd", 54);
		
		for (String aa : mapa1.keySet()) {//.keySet() saca un set de todas las claves para poder recorrerlas
			System.out.println(aa);
		}
		
		SortedMap<String, Integer> mapa2=new TreeMap<>(new PorNombre());
		mapa2.putAll(mapa1);
		System.out.println("\n");
		for (String aa : mapa2.keySet()) {//.keySet() saca un set de todas las claves para poder recorrerlas
			System.out.println(aa);
		}
		System.out.println();
		for (Map.Entry<String, Integer> entry : mapa2.entrySet()) {
			System.out.println(entry.getKey()+", "+entry.getValue() );
			
		}
	}

}
