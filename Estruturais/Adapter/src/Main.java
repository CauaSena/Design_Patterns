public class Main {
	public static void main(String[] args) {
		
		SistemaBancarioLegado bancoA = new SistemaBancarioLegado();
		
		ProcessadorPagamento pagamento = new BancoAntigoAdapter(bancoA);
		
		pagamento.processarPagamento(20.3540, "DOLAR");
	}
}
