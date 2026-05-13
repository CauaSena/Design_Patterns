
public class Portao{
	boolean estaAberto;
	
	public void abrir() {
		System.out.println("Abrindo o portão.");
		estaAberto = true;
	}
	
	public void fechar() {
		System.out.println("Fechando o portão.");
		estaAberto = false;
	}
}

