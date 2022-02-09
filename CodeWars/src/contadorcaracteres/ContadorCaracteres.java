package contadorcaracteres;

public class ContadorCaracteres {
	
	
	public static int getCount(String str) {
	    int contador = 0;
	    // your code here
	    char [] array=str.toCharArray();//Convierte un string en un array de Chars
	    for(int i=0;i<array.length;i++) {
	    	if(array[i]!=' ') {
	    		contador++;
	    	}
	    }
	    return contador;
	  }

}
