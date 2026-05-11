import java.util.ArrayList;
import java.util.List;

public class Pallet extends Item {
	public List<Item> listaItens;
	
	public Pallet(String detail) {
		descricao = detail;
	}

	@Override
	public double getPeso() {
		double peso = 0;
		for (Item prods : listaItens) {
			peso = Double.sum(peso, prods.getPeso());
		}
		return peso;
	}
	
	@Override
	public void addItens(Item novaCarga) {
		if (listaItens == null) {
			listaItens = new ArrayList<Item>();
		}
		listaItens.add(novaCarga);
		System.out.println("Pallet com: " + listaItens.size() + " itens");
	}
	
	@Override
	public String verDescricao() {
		return descricao;
	}
}
