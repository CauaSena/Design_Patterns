
public class Pacote extends Item{
	private double peso;
	
	public Pacote(double novoPeso, String novoDetalhe) {
		peso = novoPeso;
		descricao = novoDetalhe;
	}
	
	@Override
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String verDescricao() {
		return descricao;
	}
}
