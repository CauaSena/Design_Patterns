
public abstract class Item {
	String nome;
	double precoProduto;
	double imposto;
	
	public Item(String nome, double precoProduto, double imposto) {
		this.nome = nome;
		this.precoProduto = precoProduto;
		this.imposto = imposto;
	}

	abstract void aceitarVisita(VisitorOperacao visitante);
}
