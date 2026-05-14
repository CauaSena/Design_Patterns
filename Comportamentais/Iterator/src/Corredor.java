import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Corredor implements SetorEstoque<String> {
	Deque<String> listaDeItens = new ArrayDeque<String>();

	public void addProdutosCorredor(String[] produtos) {
		for (String novo : produtos) {
			if (!listaDeItens.contains(novo)) {
				listaDeItens.add(novo);
			}
		}
	}
	
	@Override
	public Iterator<String> iteradorDeItens() {
		Iterator<String> todosCorredores= listaDeItens.iterator();
		return todosCorredores;
	}
}
