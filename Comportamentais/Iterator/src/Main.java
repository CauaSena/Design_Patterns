import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Prateleiras prateleiraFrutas = new Prateleiras();
		SetorPrateleiras infosPrateleiras = new SetorPrateleiras(prateleiraFrutas);
		String[] produtos = {"Maçã", "Uva", "Pera"};
		prateleiraFrutas.novosProdutos(produtos);
		
		Iterator<Prateleiras> verEstoque = infosPrateleiras.iteradorDeItens();
		System.out.println("---PRATELEIRAS----");
		
		while (verEstoque.hasNext()) {
			Prateleiras itensPrateleira = verEstoque.next();
			Iterator<String> listaProdutoIndividual = itensPrateleira.iteradorDeItens(); 
	    
			while (listaProdutoIndividual.hasNext()) {
				System.out.println(listaProdutoIndividual.next());
			}
		}
		
		
		  Corredor corredorEntrada = new Corredor();
		  SetorCorredor infosCorredores = new SetorCorredor(corredorEntrada); String[] itens = {"Mesa","Cadeira","Vassoura"}; 
		  corredorEntrada.addProdutosCorredor(itens);
		  
		  Iterator<Corredor> verAlas =  infosCorredores.iteradorDeItens();
		  System.out.println("\n---CORREDORES----");
		  while (verAlas.hasNext()) {
			  	Corredor itensCorredor = verAlas.next();
			  	Iterator<String> listaProdutoIndividual = itensCorredor.iteradorDeItens(); 
		    
				while (listaProdutoIndividual.hasNext()) {
					System.out.println(listaProdutoIndividual.next());
				}
		  } 
	}

}
