public class Fabrica {
	public static Notificacao criarNotificacao(int tipoDeEnvio) {
		return switch (tipoDeEnvio) {
		case 1 -> new SMS();
		case 2 -> new Email();
		case 3 -> new Push();
		
		default -> throw new IllegalArgumentException("Tipo de notificacao inválido: " + tipoDeEnvio);
		};
	}
}
