	
	public class ProcessadorJSON extends ProcessamentoDePagamento{
		@Override
		protected void conectarCentral() {
			System.out.println("ARQUIVO JSON - Conecxão com a central estabelecida.");	
		}
		@Override
		protected void extrairDados() {
			System.out.println("ARQUIVO JSON - Dados extraídos com sucesso!");
		}
	}
