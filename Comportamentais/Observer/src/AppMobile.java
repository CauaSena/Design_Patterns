
public class AppMobile implements ObservadorPreco{
	

	@Override
	public void receberNotificacao(String nomeAcao, double precoAcao) {
		System.out.println("Notificação Push: A ação " +nomeAcao+ " mudou para R$" + String.format("%.2f", precoAcao));
	}
}
