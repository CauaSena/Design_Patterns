
public abstract class Aeronave {
	protected String nome;
	protected boolean estaNoAr;
	protected boolean estaNaPista;
	protected TorreDeControleMediator torre;
	String avisoDaTorre;
	
	public Aeronave(String nome, TorreDeControleMediator torre) {
		this.nome = nome;
		this.torre = torre;
	}

	protected abstract boolean solicitarPouso();
}
