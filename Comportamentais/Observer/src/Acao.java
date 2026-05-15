import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Acao {
	private Deque<ObservadorPreco> listaObservers = new ArrayDeque<ObservadorPreco>();
	private String nome;
	private double valorAção;
	
	public Acao(String nome, double valorAção) {
		super();
		this.nome = nome;
		this.valorAção = valorAção;
	}

	public double getValorAção() {
		return valorAção;
	}

	public void setValorAção(double valorAção) {
		this.valorAção = valorAção;
		enviarNotificacao(this.nome, this.valorAção);
	}

	public void enviarNotificacao(String nomeAcao,double novoValor) {
		Iterator<ObservadorPreco> iterador = listaObservers.iterator();
		while (iterador.hasNext()) {
			ObservadorPreco notificado = iterador.next();
			notificado.receberNotificacao(nomeAcao, novoValor);
		}
	}
	
	public void adicionarObserver(ObservadorPreco observer) {
		if (!listaObservers.contains(observer)) {
			listaObservers.add(observer);
			System.out.println("Salvo com sucesso!");
		}
		else {
			System.out.println("Já existe nessa base de dados!");
		}
	}
		
	public void removerObserver(ObservadorPreco observer) {
		if (listaObservers.contains(observer)) {
			listaObservers.remove(observer);
			System.out.println(observer.getClass().getSimpleName() +" REMOVIDO!");
		}
		else {
			System.out.println("Já existe nessa base de dados!");
		}	
	}
}
