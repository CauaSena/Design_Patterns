
public class AbrirPortao implements Comando{
	private Portao portao;

	public AbrirPortao(Portao portao) {
		this.portao = portao;
	}
	@Override
	public void executar() {
		portao.abrir();
	}
	
	@Override
	public void desfazer() {
		System.out.println("Desfazendo ação ....");
		portao.fechar();
	}
	
}
