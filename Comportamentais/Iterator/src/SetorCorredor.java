import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class SetorCorredor implements SetorEstoque<Corredor>{
	Corredor corredor;
	Deque<Corredor> listaDoSetorCorredor = new ArrayDeque<Corredor>();
	
	public SetorCorredor(Corredor corredor) {
		this.corredor = corredor;
		listaDoSetorCorredor.add(this.corredor);
	}

	@Override
	public Iterator<Corredor> iteradorDeItens() {
		Iterator<Corredor> todosCorredores= listaDoSetorCorredor.iterator();
		return todosCorredores;
	}
}	