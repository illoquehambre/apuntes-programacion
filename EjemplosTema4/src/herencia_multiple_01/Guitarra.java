package herencia_multiple_01;

public class Guitarra implements IInstrumento{
	
	private String marca;
	private int nCuerdas;
	
	
	public Guitarra(String marca, int nCuerdas) {
		super();
		this.marca = marca;
		this.nCuerdas = nCuerdas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getnCuerdas() {
		return nCuerdas;
	}


	public void setnCuerdas(int nCuerdas) {
		this.nCuerdas = nCuerdas;
	}


	@Override
	public String toString() {
		return "Guitarra [marca=" + marca + ", nCuerdas=" + nCuerdas + "]";
	}


	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void afinar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mostrarTipo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
