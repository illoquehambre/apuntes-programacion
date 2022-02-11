package wellofideas;

public class Kata {
	
	public static String well(String[] x) {
	    // TODO
		String bueno="good";
		String respuesta;
	    int contador=0;
	    for(int i=0;i<x.length;i++){
	      if(x[i].equalsIgnoreCase(bueno)) {
	    	  contador++;
	      }
	    }
	    switch(contador) {
		    case 0:
		    	respuesta="Fail!";
		    	break;
		    case 1:
		    	respuesta="Publish!";
		    	break;
		    case 2:
		    	respuesta="Publish!";
		    	break;
	    	default:
	    		respuesta="I smell a series!";
	    		break;	    		
	    }
	    return respuesta;
	  }

}
