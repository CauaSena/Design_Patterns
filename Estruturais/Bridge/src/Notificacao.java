
public abstract class Notificacao{
	public MeioDeComunicação meio;
	
	public Notificacao(MeioDeComunicação meio) {
		this.meio = meio;
	}
	
	public abstract void conteudoMsg();
}
