
public class DiminuirTemp implements Comando {
	ArCondicionado novoArCondicionado;
	
	public DiminuirTemp(ArCondicionado novoArCondicionado) {
		super();
		this.novoArCondicionado = novoArCondicionado;
	}
	@Override
	public void executar() {
		novoArCondicionado.diminuir();
	}@Override
	public void desfazer() {
		System.out.println("Desfazendo ação ....");
		novoArCondicionado.aumentar();
	}
}
