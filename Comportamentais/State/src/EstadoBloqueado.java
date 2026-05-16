
public class EstadoBloqueado implements EstadoConta {

	@Override
	public void sacar(ContaBancaria conta, double valor) {
		System.out.println("Conta bloqueada. Vá a uma agência para desbloquear.");
	}

	@Override
	public void depositar(ContaBancaria conta, double valor) {
		System.out.println("Conta bloqueada. Vá a uma agência para desbloquear.");
	}

	@Override
	public void verificarStatus(ContaBancaria conta) {
		System.out.println("Conta bloqueada. Vá a uma agência para desbloquear.");
	}

}
