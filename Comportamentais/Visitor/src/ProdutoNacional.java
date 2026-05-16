
public class ProdutoNacional extends Item{

	public ProdutoNacional(String nome, double precoProduto, double imposto) {
		super(nome, precoProduto, imposto);
	}

	@Override
	void aceitarVisita(VisitorOperacao visitante) {
		visitante.visitar(this);
	}
}
