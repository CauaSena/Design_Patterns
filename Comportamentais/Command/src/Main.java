
public class Main {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();

		Comando realizarAcao = controle.ligarLuzBtn;
		controle.click(realizarAcao);

		realizarAcao = controle.desligarLuzBtn;
		controle.click(realizarAcao);

		realizarAcao = controle.aumentarTempBtn; 
		controle.click(realizarAcao);

		realizarAcao = controle.diminuirTempBtn; 
		controle.click(realizarAcao);

		realizarAcao = controle.abrirPortaoBtn;
		controle.click(realizarAcao);

		realizarAcao = controle.fecharPortaoBtn; 
		controle.click(realizarAcao);

		controle.clickVoltarAcao();
		
	}
}
