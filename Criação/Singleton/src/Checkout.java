
public class Checkout {
	ConfiguracaoManager config = ConfiguracaoManager.getInstancia();
	
	public void finalizar() {
		String cartao = config.verConfigs().getProperty("cartao");
		 if (cartao != null) {
			 System.out.println("Seu numero de cartão: " + cartao);
			 System.out.println("Pagamento em andamento");
			 System.out.println("Sucesso!");
		}
	}
}
