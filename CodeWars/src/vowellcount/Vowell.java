package vowellcount;

public class Vowell {
	
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    // your code here
	    char [] array=str.toCharArray();//Convierte un string en un array de Chars
	    for(int i=0;i<array.length;i++) {
	    	if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u') {
	    		vowelsCount++;
	    	}
	    }
	    return vowelsCount;
	  }
	
}
