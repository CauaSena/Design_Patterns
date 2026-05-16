
public class FreteExpresso implements Strategy{
	private double valorKgFixo = 25.00;
	private int diasAteChegar = 2;
	
	@Override
	public void calcular(double peso) {
		double valorFrete = peso * valorKgFixo;
		System.out.println("EXPRESSO - Seu frete custa: R$" + String.format("%.2f", valorFrete) + " levará até " + diasAteChegar + " dias para chegar");
	}
}
