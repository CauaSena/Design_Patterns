import java.util.ArrayDeque;
import java.util.Deque;

public class Historico {
	private Deque<Memento> versoesAnteriores = new  ArrayDeque<Memento>();

	public void salvarMemento(Documento doc) {
		versoesAnteriores.push(doc.salvarCopia());
	}
	
	public void tirarMudancas(Documento doc) {
		doc.desfazerMudança(versoesAnteriores.pop());
	}
}
