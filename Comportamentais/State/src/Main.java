
public class Main {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		
		conta.depositarValor(300.50);
		conta.sacarValor(250.25);
		conta.sacarValor(100.25);
		conta.depositarValor(25);
		conta.sacarValor(200);
		conta.sacarValor(3);
	}
}
