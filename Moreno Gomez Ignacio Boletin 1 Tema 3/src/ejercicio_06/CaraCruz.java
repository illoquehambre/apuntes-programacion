package ejercicio_06;
import java.util.Random;
public class CaraCruz {
	
	//atributos
	private boolean player;
	private boolean result;
	//constructor
	public CaraCruz(boolean player, boolean result) {
		this.player=player;
		this.result=result;

	}
	//getter
		public boolean getPlayer() {
			return player;
		}
		public boolean getResult() {
			return result;
		}
	//setter
		public void setPlayer(boolean player) {
			this.player=player;
		}
		public void setResult(boolean result) {
			this.result=result;
		}
	//métodos
	public boolean lanzarMoneda(boolean result) {
		Random n=new Random(System.nanoTime());
		result=n.nextBoolean();
		this.result=result;
		return result;
	}
	public boolean comprobarGanador() {
		this.lanzarMoneda();
		if(result=player) {

			return true;
		}else {
			return false;
		}		
	}
	public boolean mostrarGanador() {
		if(result=player) {
			System.out.println("Victoria!!");
			return true; 
		}else {
			System.out.println("Siga jugando");
			return false;
		}		
	}
}
