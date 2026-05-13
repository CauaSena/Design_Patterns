
public class FecharPortao implements Comando{
	private Portao portao;

	public FecharPortao(Portao portao) {
		this.portao = portao;
	}
	@Override
	public void executar() {
		portao.fechar();
	}
	
	@Override
	public void desfazer() {
		System.out.println("Desfazendo ação ....");
		portao.abrir();
	}
	
}