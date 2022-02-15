package ejercicio_02;

import java.util.Random;

public class ArrayReales implements IEstadisticas{
	
	private double[] num;

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}
	
	public void mostrarArray() {
		for(int i=0;i<num.length;i++) {
			System.out.println("Posición "+i+": "+num[i]);
		}
	}
	public void rellenarArray(int max, int min) {
		Random r=new Random(System.nanoTime());
		for(int i=0;i<num.length;i++) {
			num[i]=r.nextInt(max-min+1)+1;
		}
	}
	@Override
	public double calcularMinimo() {
		double min=0;
		int contador=0;
		for(int i=0;i<num.length;i++) {
			if(contador==0) {
				min=num[i];
			}else {
				if(num[i]<min) {
					min=num[i];
				}
			}
		}
		// TODO Auto-generated method stub
		return min;
	}

	@Override
	public double calcularMaximo() {
		// TODO Auto-generated method stub
		double max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		return max;
	}

	@Override
	public double calcularSumatorio() {
		// TODO Auto-generated method stub
		double suma=0;
		for(int i=0;i<num.length;i++) {
			suma=suma+num[i];
		}
		return suma;
	}
	
	
	

}
