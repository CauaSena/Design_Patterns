
public class EstadoNegativo implements EstadoConta {

	@Override
	public void sacar(ContaBancaria conta, double valor) {
		double novoSaldo = conta.getSaldo() - valor;
		if (novoSaldo >= conta.limiteChequeEspecial) {
			conta.setSaldo(novoSaldo);
			System.out.println("Saque realizado! Novo saldo: " + conta.getSaldo());
			System.out.println("LEMBRETE: Limite do cheque especial: R$" + String.format("%.2f", conta.limiteChequeEspecial));
		}else {
			conta.setSaldo(novoSaldo);
			System.out.println("Operação Negada.Bloqueando conta por suspeita de fraude");
			verificarStatus(conta);
		}
	}

	@Override
	public void depositar(ContaBancaria conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor - conta.taxaDepositoNegativado));
		verificarStatus(conta);
		System.out.println("Depósito realizado! Novo saldo: R$" + String.format("%.2f", conta.getSaldo()));
		System.out.println("LEMBRETE - Caso esteja negativado, cada depósito terá uma taxa de: R$" + String.format("%.2f", conta.taxaDepositoNegativado));
	}

	@Override
	public void verificarStatus(ContaBancaria conta) {
		if (conta.getSaldo() >= 0) {
			conta.setStatus(new EstadoAtivo());
		}else if (conta.getSaldo() < conta.limiteChequeEspecial) {
			conta.setStatus(new EstadoBloqueado());
		}
	}

}
