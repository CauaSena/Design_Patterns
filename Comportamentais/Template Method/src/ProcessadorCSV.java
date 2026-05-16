
public class ProcessadorCSV extends ProcessamentoDePagamento{
	
	@Override
	protected void conectarCentral() {
		System.out.println("ARQUIVO CSV - Conecxão com a central estabelecida.");	
	}
	@Override
	protected void extrairDados() {
		System.out.println("ARQUIVO CSV - Dados extraídos com sucesso!");
	}
	
}
