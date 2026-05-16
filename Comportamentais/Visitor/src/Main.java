import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		VisitorOperacao calcImposto = new VisitanteCalculadoraImposto();
		VisitorOperacao exportarXML = new VisitanteExportadorXML();
		
		Item prodNacional = new ProdutoNacional("Blusa do Brasil",100.00, 0.28);
		Item prodImportado = new ProdutoImportado("Celular",100.00, 0.40);
		Item servicoDigital = new ServicoDigital("Sofá", 100.00, 0.26);
		
		List<Item> listaDeProdutos = new ArrayList<Item>();
		listaDeProdutos.add(prodNacional);
		listaDeProdutos.add(prodImportado);
		listaDeProdutos.add(servicoDigital);
		
		for (Item item : listaDeProdutos) {
			System.out.println(item.nome);
			item.aceitarVisita(calcImposto);
			System.out.println("--------------------");
		}
		System.out.println("***********************************************");
		for (Item item : listaDeProdutos) {
			item.aceitarVisita(exportarXML);
			System.out.println("--------------------");
		}
	}
}
