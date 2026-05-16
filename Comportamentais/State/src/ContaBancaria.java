
public class ContaBancaria {
	private double saldo;
	private EstadoConta status;
	protected double taxaDepositoNegativado;
	protected double limiteChequeEspecial;
	
	public ContaBancaria() {
		this.saldo = 0;
		this.taxaDepositoNegativado = 5.00;
		this.limiteChequeEspecial = -200.00;
		this.status = new EstadoAtivo();
	}

	public void setStatus(EstadoConta status) {
		this.status = status;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void verificarStatusAtual() {
		this.status.verificarStatus(this);
	}
	
	public void sacarValor(double valorSaque) {
		this.status.sacar(this, valorSaque);
	}
	
	public void depositarValor(double valorDeposito) {
		this.status.depositar(this, valorDeposito);
	}
}
