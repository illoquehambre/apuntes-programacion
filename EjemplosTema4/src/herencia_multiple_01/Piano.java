package herencia_multiple_01;

public class Piano implements IInstrumento {
	
	private int nOctavas;

	public Piano(int nOctavas) {
		super();
		this.nOctavas = nOctavas;
	}
	
	
	
	@Override
	public String toString() {
		return "Piano [nOctavas=" + nOctavas + "]";
	}



	public int getnOctavas() {
		return nOctavas;
	}



	public void setnOctavas(int nOctavas) {
		this.nOctavas = nOctavas;
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
