
public class CorretoraRobotizada implements ObservadorPreco{
	@Override
	public void receberNotificacao(String nomeAcao, double precoAcao) {
		if (precoAcao <= 20) {
			System.out.println("COMPRA EXECUTADA AUTOMATICAMENTE. VALOR DA AÇÃO: R$" + String.format("%.2f", precoAcao));
		}else {
			System.out.println("VALOR DA AÇÃO ATUALIZADO - ACIMA DO LIMITE DE COMPRA");
		}
	}
}
