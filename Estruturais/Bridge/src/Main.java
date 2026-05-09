public class Main {
	public static void main(String[] args) {
		
		
		MeioDeComunicação modoWhatsApp = new WhatsApp();
		MeioDeComunicação modoSMS = new Email();
		MeioDeComunicação modoEmail = new SMS();
		
		
		Notificacao fatura = new Cobrança(modoWhatsApp);
		Notificacao  alerta = new Alerta(modoEmail);
		Notificacao  atraso = new Atraso(modoSMS);

		
		fatura.conteudoMsg();
		System.out.println("-----------------");
		alerta.conteudoMsg();
		System.out.println("-----------------");
		atraso.conteudoMsg();
	}
}
