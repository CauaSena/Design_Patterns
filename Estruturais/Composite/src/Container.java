import java.util.ArrayList;
import java.util.List;

public class Container extends Item{
	public List<Item> listaItens;

	public Container(String detail) {
		descricao = detail;
	}
	
	@Override
	public double getPeso() {
		double peso = 0;
		for (Item prod : listaItens) {
			peso += prod.getPeso();
		}
		return peso;
	}
	
	@Override
	public void addItens(Item novaCarga) {
		if (listaItens == null) {
			listaItens = new ArrayList<Item>();
		}
		listaItens.add(novaCarga);
		System.out.println("Container com: " + listaItens.size() + " itens");
	}
	
	@Override
	public String verDescricao() {
		return descricao;
	}
}
