
public class WhatsApp implements MeioDeComunicação {
	@Override
	public void enviarMensagem(String conteudo) {		
		System.out.println("[WhatsApp]" + conteudo);
	}

}
