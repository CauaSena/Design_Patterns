import java.util.HashMap;
import java.util.Map;

public class TiposArvoresFactory {
	private static Map<String, TipoArvore> floresta = new HashMap<String, TipoArvore>();
	
	public static Map<String, TipoArvore> getFloresta() {
		return floresta;
	}

	public static TipoArvore tiposDeArvore(String nome, String corFolha, String textura, String modelo) {
		if (!floresta.containsKey(nome)) {
			floresta.put(nome, new TipoArvore(nome, corFolha, textura, modelo));
			System.out.println("Tipo novo de árvore criado e armazenado com sucesso!");
		}
		return floresta.get(nome);
	}
}
