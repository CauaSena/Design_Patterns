
public class AumentarTemp implements Comando {
	ArCondicionado novoArCondicionado;
	
	public AumentarTemp(ArCondicionado novoArCondicionado) {
		this.novoArCondicionado = novoArCondicionado;
	}
	@Override
	public void executar() {
		novoArCondicionado.aumentar();
	}@Override
	public void desfazer() {
		System.out.println("Desfazendo ação ....");
		novoArCondicionado.diminuir();
	}
}