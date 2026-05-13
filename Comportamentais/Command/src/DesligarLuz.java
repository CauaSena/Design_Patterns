
public class DesligarLuz implements Comando {
	private Luz luminaria;
	
	public DesligarLuz(Luz luminaria) {
		this.luminaria = luminaria;
	}

	@Override
	public void executar() {
		luminaria.desligar();
	}

	@Override
	public void desfazer() {
		System.out.println("Desfazendo ação ....");
		luminaria.ligar();
	}

}
