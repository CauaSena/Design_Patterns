
public class SecretariaDeCreditoFacade {
	private Cliente cliente;
	private AnaliseDeCredito analiseDeCredito;
	
	public SecretariaDeCreditoFacade(Cliente contaCliente) {
		this.cliente = contaCliente;
		this.analiseDeCredito = new AnaliseDeCredito(contaCliente);
	}
	
	public boolean solicitarEmprestimo(double valor, String nome) {
		boolean temp = false;
		if (nome.equals(cliente.getNome())) {
			analiseDeCredito.verificarScoreInterno();
			if (analiseDeCredito.getScoreCliente() >= 500) {
				cliente.setValorDivida(valor);
				System.out.println("EMPRÉSTIMO ACEITO.");
				temp = true;
			}
			else if (analiseDeCredito.getScoreCliente() < 500 && analiseDeCredito.getScoreCliente() > 200) {
				if (valor <= (analiseDeCredito.SaberSaldo() * 2) ) {
					cliente.setValorDivida(valor);
					temp = true;
					System.out.println("EMPRÉSTIMO ACEITO.");
				}else {
					System.out.println("EMPRÉSTIMO NEGADO. Máximo permitido para o seu Score: " + (analiseDeCredito.SaberSaldo() * 2) );
					return temp;
				}
			}else {
				System.out.println("EMPRÉSTIMO NEGADO. Score muito baixo.");
				return temp;
			}
			return temp;			
		}
		else {
			System.out.println("CONTA INVÁLIDA.");
			return temp;
		}
	}
	
}
