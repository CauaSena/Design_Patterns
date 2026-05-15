import java.util.ArrayList;
import java.util.List;

public class Memento{
	private String autor;
	private String nomeDoc;
	private String texto;
	private List<String> formatacao = new ArrayList<String>();
	
	public Memento(String autor, String nomeDoc, String texto, List<String> formatacao) {
		super();
		this.autor = autor;
		this.nomeDoc = nomeDoc;
		this.texto = texto;
		this.formatacao = new ArrayList<>(formatacao);	
		}
	
	public String getAutor() {
		return autor;
	}
	
	public String getNomeDoc() {
		return nomeDoc;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public List<String> getFormatacao() {
		return formatacao;
	}
}
