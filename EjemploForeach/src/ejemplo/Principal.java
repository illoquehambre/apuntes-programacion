package ejemplo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int[] array=new int[5];
		//for normal
		for (int i=0;i<array.length;i++) {
			suma=suma+i;
			array[i]=suma;
			System.out.println(array[i]);
		}
		//for each
		for(int i : array) {
			suma=suma+i;
			array[i]=suma;
		}
	}

}
