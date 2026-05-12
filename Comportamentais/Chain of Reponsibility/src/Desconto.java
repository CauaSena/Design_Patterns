
public class Desconto extends ValidadorChain{
	private double valorDesconto = 0;

	@Override
	public boolean resultadoDaEtapa() {
		if (valorDesconto > 0) {
			valorConta -= (valorConta * valorDesconto);
			System.out.println("Desconto de " + (valorDesconto*100) + "% aplicado.");
		} else {
			System.out.println("Sem descontos.");
		} 
		return true;
	}
}
