
public class Pedido {
	String nome;
	double pesoPedido;
	boolean temPrime;
	Strategy frete;
	
	public Pedido(String nome, double pesoPedido, boolean temPrime) {
		this.nome = nome;
		this.pesoPedido = pesoPedido;
		this.temPrime = temPrime;
		if(temPrime) {
			this.frete = new FreteGratis();
		}
		else {
			this.frete = new FretePadrao();
		}	
	}
	
	public void setFrete(Strategy frete) {
		this.frete = frete;
	}

	public void verPrecoFrete() {
		frete.calcular(this.pesoPedido);
	}
}

