
public class Fraude extends ValidadorChain{

	@Override
	public boolean resultadoDaEtapa() {
		if (valorConta > 250) {
			System.out.println("Só aceitamos compras deste valor na loja física.");
			return false;
		} 
		System.out.println("Sem suspeita de fraudes.");
		return true;
	}
}
