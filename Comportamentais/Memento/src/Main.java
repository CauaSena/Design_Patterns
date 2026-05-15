import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Documento meuDoc = new Documento();
		Historico gerenteCopias = new Historico();
		List<String> configsFormatacao = new ArrayList<String>();
		configsFormatacao.add("Nada");
		
		meuDoc.setAutor("Cauã");
		meuDoc.setNomeDoc("Memento");
		meuDoc.setFormatacao(configsFormatacao);		
		meuDoc.setTexto("Aprendendo Memento");
		
		gerenteCopias.salvarMemento(meuDoc);
		meuDoc.verDoc();
		System.out.println("-------------------");
		
		configsFormatacao.add("Bordas Padrão ABNT");
		meuDoc.setFormatacao(configsFormatacao);
		meuDoc.setNomeDoc(" - Um Design Pattern");
		
		
		gerenteCopias.salvarMemento(meuDoc);
		meuDoc.verDoc();

		System.out.println("-------------------");
		configsFormatacao.add("Besteira");
		meuDoc.setFormatacao(configsFormatacao);
		meuDoc.setNomeDoc(" - Comportamental");
		meuDoc.setAutor("Sena");
		meuDoc.setTexto("\\\\\\\\\\\\\\");
		meuDoc.verDoc();
		
		System.out.println("-------------------");
		
		gerenteCopias.tirarMudancas(meuDoc);
		meuDoc.verDoc();
		
	}
}
