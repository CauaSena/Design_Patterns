
public class Luz{
	boolean estaLigada;
	
	public void ligar() {
		System.out.println("Acendendo a luz.");
		estaLigada = true;
	}
	
	public void desligar() {
		System.out.println("Desligando a Luz.");
		estaLigada = false;
	}
}
