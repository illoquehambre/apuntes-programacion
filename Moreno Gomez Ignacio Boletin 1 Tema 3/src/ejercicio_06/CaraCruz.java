package ejercicio_06;
import java.util.Random;
public class CaraCruz {
	
	//atributos
	private int player;
	//constructor
	public CaraCruz(int player) {
		this.player=player;

	}
	//getter
		public int getPlayer() {
			return player;
		}
	//setter
		public void setPlayer(int player) {
			this.player=player;
		}
	//métodos
	public int lanzarMoneda(){
		int max=2, min=1;
		Random n=new Random(System.nanoTime());
		return n.nextInt(max-min+1)+min;
	}
	public boolean comprobarGanador() {
		if(lanzarMoneda()==player) {
			return true;
		}else {
			return false;
		}		
	}
	public void mostrarGanador() {
		if(comprobarGanador()==true) {
			System.out.println("OLEEEEEEEE, Victoria!!");
			return; 
		}else {
			System.out.println("Uy que pena, siga jugando");
			return;
		}		
	}
}
