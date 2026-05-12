
public class Main {
	public static void main(String[] args) {
		ValidadorChain estoque = new Estoque();
		ValidadorChain desconto = new Desconto();
		ValidadorChain fraude = new Fraude();
		ValidadorChain cartao = new Cartao(1234);

		estoque.proximaEtapa(desconto);
		desconto.proximaEtapa(fraude);
		fraude.proximaEtapa(cartao);
		
		estoque.verificarEtapas();
	}
}
