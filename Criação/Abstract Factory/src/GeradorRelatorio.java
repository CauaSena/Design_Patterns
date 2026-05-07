
public class GeradorRelatorio {
	public final RelatorioFactory fabrica;
	
	public GeradorRelatorio(RelatorioFactory fabrica) {
		this.fabrica = fabrica;
	}
	
	public void exportar() {
		fabrica.criarCabecalho();
		fabrica.criarCorpo();
		System.out.println("Relatório completo! \n -------------");
	}
}
