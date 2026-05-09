
public class Main {

	public static void main(String[] args) {
		Checkout comprar = new Checkout();
	
		for (int i = 0; i < 2; i++) {
			comprar.finalizar();
		}
		
		Checkout maisCompras = new Checkout();
		
		for (int i = 0; i < 2; i++) {
			maisCompras.finalizar();
		}
	}

}
