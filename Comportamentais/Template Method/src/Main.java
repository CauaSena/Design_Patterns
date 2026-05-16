
public class Main {
	public static void main(String[] args) {
		ProcessamentoDePagamento arquivoCSV = new ProcessadorCSV();
		ProcessamentoDePagamento arquivoJSON = new ProcessadorJSON();
	
		arquivoCSV.criarRelatorio();
		System.out.println("--------------------------------");
		arquivoJSON.criarRelatorio();
	}
}
