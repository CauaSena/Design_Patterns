
public class AnaliseDeCredito {
	private Cliente cliente;
	 private int scoreCliente = 0;
	
	public AnaliseDeCredito(Cliente clienteAnalise) {
		cliente = clienteAnalise;
	}
	
	public int getScoreCliente(){
		return scoreCliente;
	}
	
	public int verificarScoreInterno() {		
		
		if (SaberSaldo() >= 2000.0) {
			scoreCliente += 700;
		}else if (SaberSaldo() >= 1000.0) {
			scoreCliente += 200;
		}
		
		
		if (!SaberHistorico()) {
			scoreCliente += 300;	
		}else {
			scoreCliente += 150;
		}
		
		
		return scoreCliente;
	}
	
	public boolean SaberHistorico() {
		HistoricoDePagamento historicoCliente  = new HistoricoDePagamento();
		return historicoCliente.TemDivida(cliente.getValorDivida());
	}
	
	public double SaberSaldo() {
		SaldoBancario saldoCliente = new SaldoBancario();
		double saldoAtualizado = saldoCliente.getDinheiro(cliente.getDinheiroEmConta(), cliente.getValorDivida());
		return saldoAtualizado;
	}
}