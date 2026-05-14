import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TorreDeControleMediator implements InterfaceTorre {
	String nome;
	boolean pistaOcupada = false;
	Deque<Aeronave> listaDeAeronaves = new ArrayDeque<Aeronave>();

	public TorreDeControleMediator(String nome) {
		super();
		this.nome = nome;
	}
	
	public void pistaOcupada() {
		
	}
	
	@Override
	public boolean AutorizarPouso(Aeronave naveEmAnalise) {
		boolean confirmacao = false;
		
		if (!pistaOcupada) {
	        pistaOcupada = true;
	        naveEmAnalise.estaNaPista = true;
			listaDeAeronaves.add(naveEmAnalise);
			confirmacao = true;
			return confirmacao;
	    }
		else {
			listaDeAeronaves.add(naveEmAnalise);
		}
		return confirmacao;
	}

	@Override
	public void EnviarAviso(String aviso) {
		Iterator<Aeronave> todosAvioes = listaDeAeronaves.iterator();
		while (todosAvioes.hasNext()) {
			Aeronave nave = todosAvioes.next();
			nave.avisoDaTorre = aviso;
		}
		System.out.println("Mensagem da torre entregue a todos os aviões.");
	}	
}
