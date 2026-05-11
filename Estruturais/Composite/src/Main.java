
public class Main {
	public static void main(String[] args) {

		Item caixa = new Caixa(2.3, "Menos Pesada que o pacote");
		Item pacote = new Pacote(0.9,"Mais pesado que a caixa");
		Item pallet = new Pallet("Só aceita caixas");
		Item container = new Container("Aceita pallets e caixas soltas");

		pallet.addItens(caixa);
		System.out.println("Peso Pallet: " + String.format("%.2f", pallet.getPeso()) + " KG");

		container.addItens(pacote); 
		System.out.println("Peso Container: " + String.format("%.2f", container.getPeso()) + " KG");
		
		container.addItens(pallet); 
		System.out.println("Peso Container: " + String.format("%.2f", container.getPeso()) + " KG");

	}		
}
