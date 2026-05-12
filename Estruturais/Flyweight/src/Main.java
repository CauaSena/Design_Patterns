public class Main {
	public static void main(String[] args) {
		Arvore novaArvore = new Arvore(TiposArvoresFactory.tiposDeArvore("Carvalho","Verde Escuro","Lascada", "Tronco alto"));
		novaArvore.toString();
		
		int arvoresNaFloresta = 1;
		for (int i = 0; i < 4; i++) {
			novaArvore = new Arvore(TiposArvoresFactory.tiposDeArvore("Betula","Verde Claro","Lisa", "Tronco mediano e claro"));
			arvoresNaFloresta++;
			novaArvore = new Arvore(TiposArvoresFactory.tiposDeArvore("Cacto","Totalmente Verde","Espinhoso", "Tronco baixo e redondo"));
			arvoresNaFloresta++;
			novaArvore = new Arvore(TiposArvoresFactory.tiposDeArvore("Palmeira","Totalmente Vibrante","Áspera", "Tronco alto e poucas folhas"));
			arvoresNaFloresta++;
			novaArvore = new Arvore(TiposArvoresFactory.tiposDeArvore("Carvalho","Verde Escuro","Lascada", "Tronco alto"));
			arvoresNaFloresta++;
		}
		
		System.out.println("Floresta com " + arvoresNaFloresta + " árvores criadas");
		System.out.println("Floresta com " + TiposArvoresFactory.getFloresta().size() + " tipos de árvores diferentes");
	}
}
