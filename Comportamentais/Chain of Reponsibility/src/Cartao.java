
public class Cartao extends ValidadorChain{
	int numCartao;
	
	public Cartao(int numCartao) {
		this.numCartao = numCartao;
	}

	@Override
	public boolean resultadoDaEtapa() {
		if (numCartao == 1234) {
			System.out.println("Cartão aceito");
			return true;
		}
		System.out.println("Cartão NEGADO");
		return false;
	}
}
