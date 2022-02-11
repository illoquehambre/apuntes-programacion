package areaorperimeter;

public class Solution {
	
	 public static int areaOrPerimeter (int l, int w) {
	        return (l==w)?  l*w : (l*2)+(w*2);// el signo de interrogación '?' funciona como 'if' y los dos puntos ':' funciona como 'else'
	    }
}
