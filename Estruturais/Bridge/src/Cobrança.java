public class Cobrança extends Notificacao{
	public Cobrança(MeioDeComunicação modo) {
		super(modo);
	}
	
	@Override
	public void conteudoMsg() {
		meio.enviarMensagem("Sua fatura deste mês já saiu! Entre na sua conta!");
		
	}
}