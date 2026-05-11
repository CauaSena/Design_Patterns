import java.util.List;

public abstract class Item {
	protected String descricao;
	protected List<Item> listaItens;
	
	public abstract double getPeso();

	public String verDescricao() {
		return descricao;
	}	
	
	public void addItens(Item novaCarga){
		throw new UnsupportedOperationException("Este item não suporta sub-itens.");
	};
	
}
