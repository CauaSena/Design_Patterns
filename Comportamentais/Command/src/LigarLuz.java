
public class LigarLuz implements Comando {
	public Luz luminaria;
	
	public LigarLuz(Luz luminaria) {
		this.luminaria = luminaria;
	}

	@Override
	public void executar() {
		luminaria.ligar();
	}

	@Override
	public void desfazer() {
		System.out.println("Desfazendo ação ....");
		luminaria.desligar();

	}

}
