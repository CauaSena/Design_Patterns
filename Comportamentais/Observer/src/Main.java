
public class Main {
	public static void main(String[] args) {
		Acao petrobras = new Acao("PETR4",23.00);
		Acao amazon= new Acao("AMZO34",32.00);

		ObservadorPreco appX = new AppMobile();
		ObservadorPreco corretoraX = new CorretoraRobotizada();

		petrobras.adicionarObserver(appX);
		petrobras.adicionarObserver(corretoraX);

		petrobras.setValorAção(19.00);
		petrobras.removerObserver(appX);
		petrobras.setValorAção(21.00);
		//AÇÃO DA AMAZON
		amazon.adicionarObserver(appX);
		amazon.adicionarObserver(corretoraX);
		
		amazon.setValorAção(24.00);
		amazon.removerObserver(corretoraX);		
		amazon.setValorAção(20.00);
	}
}
