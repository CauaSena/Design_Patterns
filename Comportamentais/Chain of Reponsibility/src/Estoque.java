
public class Estoque extends ValidadorChain{
	public int qtd = 1;
	
	@Override
	public boolean resultadoDaEtapa() {
		if (qtd > 0) {
			System.out.println("Estoque disponível.");
			return true;
		}
		else {
			System.out.println("Estoque sem produto.");
			return false;
		}
	}
}
