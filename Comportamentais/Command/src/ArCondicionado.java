
public class ArCondicionado{
	int temperatura = 20;
	
	public void aumentar() {
		temperatura++;
		System.out.println("Aumentando 1°C. [NOVA TEMPERATURA: " + temperatura +"°C]." );
	}
	
	public void diminuir() {
		temperatura--;
		System.out.println("Diminuindo 1°C. [NOVA TEMPERATURA: " + temperatura +"°C]." );
	}
}
