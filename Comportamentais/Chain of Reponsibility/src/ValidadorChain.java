
public abstract class ValidadorChain {
	public ValidadorChain proximaEtapa;
	public double valorConta = 100;
	
	
	public ValidadorChain proximaEtapa(ValidadorChain novaEtapa) {
		return proximaEtapa = novaEtapa;
	};
	
	public void verificarEtapas() {
		boolean retorno = this.resultadoDaEtapa();
		
		if (retorno && proximaEtapa != null) {
			proximaEtapa.verificarEtapas();
		}
	}
	
	public boolean resultadoDaEtapa() {
		return false;
	}
}
