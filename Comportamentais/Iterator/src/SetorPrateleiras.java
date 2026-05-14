import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class SetorPrateleiras implements SetorEstoque<Prateleiras>{
	Prateleiras prateleira;
	Deque<Prateleiras> listaDoSetor = new ArrayDeque<Prateleiras>();
	
	public SetorPrateleiras(Prateleiras prateleira) {
		this.prateleira = prateleira;
		listaDoSetor.add(prateleira);
	}

	@Override
	public Iterator<Prateleiras> iteradorDeItens() {
		Iterator<Prateleiras> todasPrateleiras = listaDoSetor.iterator();
		return todasPrateleiras;
	}
}	