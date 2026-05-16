
public class Main {
	public static void main(String[] args) {
		Strategy freteExpresso = new FreteExpresso();
		Strategy fretePadrao = new FretePadrao();

		Pedido pedido = new Pedido("Fogão", 4.3, true);
		pedido.verPrecoFrete();
		
		pedido.setFrete(freteExpresso);
		pedido.verPrecoFrete();

		pedido.setFrete(fretePadrao);
		pedido.verPrecoFrete();
	}
}
