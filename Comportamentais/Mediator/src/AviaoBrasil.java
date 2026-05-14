public class AviaoBrasil extends Aeronave{
	public AviaoBrasil(String nome, TorreDeControleMediator torre) {
		super(nome, torre);
		
	}

	@Override
	protected boolean solicitarPouso() {
		estaNoAr = true;
		System.out.println(nome +" SOLICITANDO POUSO À "+ torre.nome);
		return torre.AutorizarPouso(this);
	}
}
