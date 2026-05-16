
public interface EstadoConta {
	void sacar(ContaBancaria conta, double valor);
	void depositar(ContaBancaria conta, double valor);
	void verificarStatus(ContaBancaria conta);
}
