
public class SMS implements MeioDeComunicação {
	@Override
	public void enviarMensagem(String conteudo) {		
		System.out.println("[SMS]" + conteudo);
	}

}