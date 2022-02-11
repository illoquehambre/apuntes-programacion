package middlecharacter;

public class Kata {
	
	  public static String getMiddle(String word) {
		    //Code goes here!
		  char[] c=word.toCharArray();//guardamos el string en un array de chars
		  if(c.length%2==0) {//comprobamos si el número de caracteres es par o impar
			  
			 char[] c1= { c[c.length/2 -1], c[c.length/2]};//guardamos los caracteres seleccionados en otro array de char
			 return new String(c1);//devolvemos n string formado por los chars queridos
		  }else {
			  int aux=(int)c.length/2;//seleccionamos la posición de caracter de en medio al ttruncar la mitad de la longitud
			  char[] c2= {c[aux]};//guardamos los caracteres seleccionados en otro array de char
			  return new String(c2);//devolvemos n string formado por los chars queridos
		  }
	}

}
