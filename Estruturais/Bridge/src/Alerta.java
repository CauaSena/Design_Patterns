
public class Alerta extends Notificacao {

	public Alerta(MeioDeComunicação modo) {
		super(modo);
	}
	
	@Override
	public void conteudoMsg() {
		meio.enviarMensagem("Novo dispositivo identificado, bloqueie sua conta caso não seja você.");
	}

	
}