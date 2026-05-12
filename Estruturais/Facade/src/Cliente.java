
public class Cliente {
	private String idNome;
	private double dinheiroEmConta;
	private double valorDivida;
	
	public String getNome() {
		return idNome;
	}
	
	public double getDinheiroEmConta() {
		return dinheiroEmConta;
	}
	
	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	

	public Cliente(String idNome, double dinheiroEmConta, double valorDivida) {
		this.idNome = idNome;
		this.dinheiroEmConta = dinheiroEmConta;
		this.valorDivida = valorDivida;
		
		System.out.println(idNome + "Logado com sucesso.");
	}

	/*
	 * public boolean SaberHistorico() { historicoCliente = new
	 * HistoricoDePagamento(); return historicoCliente.TemDivida(valorDivida); }
	 * 
	 * public double SaberSaldo() { saldoCliente = new SaldoBancario(); double
	 * saldoAtualizado = saldoCliente.getDinheiro(dinheiroEmConta, valorDivida);
	 * return saldoAtualizado; }
	 */
}
