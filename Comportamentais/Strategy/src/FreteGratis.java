
public class FreteGratis implements Strategy{
	private double valorKgFixo = 0;
	private int diasAteChegar = 5;
	
	@Override
	public void calcular(double peso) {
		double valorFrete = peso * valorKgFixo;
		System.out.println("GRÁTIS - Seu frete custa: R$" + String.format("%.2f", valorFrete) + " levará até " + diasAteChegar + " dias para chegar");
	}
}
