
public class Email implements MeioDeComunicação {
	
	@Override
	public void enviarMensagem(String conteudo) {		
		System.out.println("[Email]" + conteudo);
	}

}