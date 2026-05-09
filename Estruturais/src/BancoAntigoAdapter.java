public class BancoAntigoAdapter implements ProcessadorPagamento{

	private final SistemaBancarioLegado bancoVelho;

	public BancoAntigoAdapter(SistemaBancarioLegado sistemaLegado) {
		this.bancoVelho = sistemaLegado; }

	@Override
	public void processarPagamento(double valor, String moeda) {

		boolean verificarMoeda = moeda.toLowerCase().equals("dolar");
		long valorCentavos = Math.round(Math.floor(valor * 100));

		if (verificarMoeda) {
			bancoVelho.executarTransacao(valorCentavos, verificarMoeda);
		}
		else {
			System.out.println("Erro: Moeda inválida. Só aceitamos Dólar");
		}
	}
}
