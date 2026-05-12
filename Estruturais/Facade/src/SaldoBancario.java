
public class SaldoBancario {
	private double saldo;
	
	double getDinheiro(double saldoEmConta, double valorDivida){
		saldo = saldoEmConta - valorDivida;
		return saldo; 
	}
}
