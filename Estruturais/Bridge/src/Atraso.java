
public class Atraso extends Notificacao {

	public Atraso(MeioDeComunicação modo) {
		super(modo);
	}
	
	@Override
	public void conteudoMsg() {
		meio.enviarMensagem("Sua fatura está atrasada há 2 dias");
	}

	
}