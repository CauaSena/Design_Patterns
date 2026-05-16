
public class EstadoAtivo implements EstadoConta{

	@Override
	public void depositar(ContaBancaria conta, double valor) {
		double novoSaldo = conta.getSaldo() + valor;
		conta.setSaldo(novoSaldo);
		System.out.println("Depósito realizado! Novo saldo: R$" + String.format("%.2f", conta.getSaldo()));
	}
	
	@Override
	public void sacar(ContaBancaria conta, double valor) {
		double novoSaldo = conta.getSaldo() - valor;
		conta.setSaldo(novoSaldo);
		this.verificarStatus(conta);
	}
	
	@Override
	public void verificarStatus(ContaBancaria conta) {
		if (conta.getSaldo() <= 0) {
			conta.setStatus(new EstadoNegativo());
			System.out.println("Saque realizado! Novo saldo: R$" + String.format("%.2f", conta.getSaldo()) + "\nAVISO - Contá está negativada!");
			System.out.println("LEMBRETE: Limite do cheque especial: R$" + String.format("%.2f", conta.limiteChequeEspecial));
		}else if (conta.getSaldo() < conta.limiteChequeEspecial) {
			System.out.println("Operação Negada. Bloqueando conta por suspeita de fraude");
			conta.setStatus(new EstadoBloqueado());
		}
	}
}
