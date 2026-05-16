
public class FretePadrao implements Strategy{
	private double valorKgFixo = 10.00;
	private int diasAteChegar = 7;
	
	@Override
	public void calcular(double peso) {
		double valorFrete = peso * valorKgFixo;
		System.out.println("PADRÃO - Seu frete custa: R$" + String.format("%.2f", valorFrete) + " levará até " + diasAteChegar + " dias para chegar");
	}
}
