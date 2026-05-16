
public class ProdutoImportado extends Item{
	
	public ProdutoImportado(String nome, double precoProduto, double imposto) {
		super(nome, precoProduto, imposto);
	}

	@Override
	void aceitarVisita(VisitorOperacao visitante) {
		visitante.visitar(this);
	}
}
