import java.util.ArrayList;
import java.util.List;

public class Documento {
	private String autor;
	private String nomeDoc;
	private String texto;
	private List<String> formatacao = new ArrayList<String>();
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNomeDoc(String nomeDoc) {
		this.nomeDoc = nomeDoc;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setFormatacao(List<String> formatacao) {
		for (String config : formatacao) {
			if (!this.formatacao.contains(config)) {
				this.formatacao.add(config);
			}			
		}
	}

	public Memento salvarCopia() {
		return new Memento(this.autor, this.nomeDoc, this.texto,  this.formatacao);
		}
	
	public void desfazerMudança(Memento memento) {
		this.autor = memento.getAutor();
		this.nomeDoc = memento.getNomeDoc();
		this.texto = memento.getTexto();
		this.formatacao = memento.getFormatacao();
	}
	
	public void verDoc() {
		System.out.println("Nome do Arquivo: "+this.nomeDoc);
		System.out.println("Autor: "+this.autor);
		System.out.println("Formatações: " + this.formatacao);
		System.out.println("Conteúdo: " + this.texto);
	}
}


