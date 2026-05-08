
public class MainClass {

	public static void main(String[] args) {
		
		Mensagem novaMensagem = new Mensagem.MensagemBuilder("Terra","Lua","Chegada do homem à lua")
		.addAnexo(null)
		.addConteudo("Podemos confirmar que a missão Apollo 11 foi bem sucedida, Armstrong?")
		.addPrioridade("Urgente.")
		.build();
		
		System.out.println("Remetente:" + novaMensagem.getRemetente());
		System.out.println("Destinatário:" + novaMensagem.getDestinatario());
		System.out.println("Assunto:" + novaMensagem.getAssunto());	
	}
}
