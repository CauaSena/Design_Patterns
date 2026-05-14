import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Prateleiras implements SetorEstoque<String> {
	Deque<String> listaProdutos = new ArrayDeque<String>();

	public void novosProdutos(String[] produtos) {
		for (String novoProduto : produtos) {
			if (!listaProdutos.contains(novoProduto)) {
				listaProdutos.push(novoProduto);
			}
		}
	}
	
	@Override
	public Iterator<String> iteradorDeItens() {
		Iterator<String> todosCorredores= listaProdutos.iterator();
		return todosCorredores;
	}
}
