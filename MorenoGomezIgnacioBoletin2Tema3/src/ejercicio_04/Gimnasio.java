package ejercicio_04;

public class Gimnasio {
	
	private Cliente[] listaClientes;

	public Gimnasio(Cliente[] listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public Cliente[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	//metodos
	public void mostrarLista() {
		for(int i=0;i<listaClientes.length;i++) {
			if(listaClientes[i].isActividad())
			System.out.println("Cliente "+i+": "+listaClientes[i].getNombre()+
					" "+listaClientes[i].getApellidos()+" "+listaClientes[i]);
		}
	}
	public double calcularMediaImc() {
		int divisor=0;
		double mediaIMC=0;
		for(int i=0;i<listaClientes.length;i++) {
			if(listaClientes[i].isActividad()) {
				mediaIMC=mediaIMC+listaClientes[i].calcularIMC();
				divisor++;
			}
			
		}
		mediaIMC=mediaIMC/divisor;
		return mediaIMC;
		
	}
}
