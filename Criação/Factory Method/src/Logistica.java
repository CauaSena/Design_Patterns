
public abstract class Logistica {
	public abstract Transporte criarTransporte();
	
	public void planejarEntrega() {
		Transporte veiculo = criarTransporte();
		veiculo.novoTransporte();
	};
	
}
