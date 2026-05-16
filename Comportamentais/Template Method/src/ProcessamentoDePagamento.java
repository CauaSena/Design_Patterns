
public abstract class ProcessamentoDePagamento {

	public final void criarRelatorio() {
		conectarCentral();
		extrairDados();
		calcImpostos();
		salvarNoBanco();
	}
	
	protected abstract void conectarCentral();
	protected abstract void extrairDados();
	
	protected void calcImpostos() {
		System.out.println("SISTEMA CENTRAL - Calculando impostos sobre a folha.");
	}
	protected void salvarNoBanco() {
		System.out.println("SISTEMA CENTRAL - Relatório asalvo no banco de dados!");
    }
}
