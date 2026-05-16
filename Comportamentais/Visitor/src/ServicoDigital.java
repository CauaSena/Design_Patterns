
public class ServicoDigital extends Item{
	
	public ServicoDigital(String nome, double precoProduto, double imposto) {
		super(nome, precoProduto, imposto);
	}

	@Override
	void aceitarVisita(VisitorOperacao visitante) {
		visitante.visitar(this);
	}
}
