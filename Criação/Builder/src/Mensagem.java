
public class Mensagem {

	private final String remetente ;
	private final String destinatario ;
	private final String assunto ;
	private final String conteudo ;
	private final String anexo ;
	private final String prioridade ;
	
	public String getRemetente() {
		return remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public String getConteudo() {
		return conteudo;
	}

	public String getAnexo() {
		return anexo;
	}

	public String getPrioridade() {
		return prioridade;
	}

	
	public Mensagem(MensagemBuilder builder) {
		remetente = builder.remetente;
		destinatario = builder.destinatario;
		assunto = builder.assunto;
		conteudo = builder.conteudo;
		anexo = builder.anexo;
		prioridade = builder.prioridade;
	}

	public static final class MensagemBuilder{
		private  String remetente;
		private  String destinatario ;
		private  String assunto ;
		private  String conteudo ;
		private  String anexo ;
		private  String prioridade ;
	
		public MensagemBuilder(String remetente, String destinatario, String assunto) {
			super();
			this.remetente = remetente;
			this.destinatario = destinatario;
			this.assunto = assunto;
		}

		public MensagemBuilder addRemetente(String remetente) {
			this.remetente = remetente;
			return this;
		}

		public MensagemBuilder addConteudo(String conteudo) {
			this.conteudo = conteudo;
			return this;
		}

		public MensagemBuilder addDestinatario (String destinatario) {
			this.destinatario = destinatario;
			return this;
		}

		public MensagemBuilder addAssunto(String assunto) {
			this.assunto = assunto;
			return this;
		}

		public MensagemBuilder addAnexo(String anexo) {
			this.anexo = anexo;
			return this;
		}

		public MensagemBuilder addPrioridade(String prioridade) {
			this.prioridade = prioridade;
			return this;
		}

		public Mensagem build() {
			if (remetente.isBlank() || remetente.isEmpty()) {
				throw new IllegalStateException("Remetente obrigatório.");
			} 
			else if (destinatario.isBlank() || destinatario.isBlank()) {
				throw new IllegalStateException("Destinatario obrigatório.");
			}
			else if(assunto.isBlank() || assunto.isEmpty()){
				throw new IllegalStateException("Assunto obrigatório.");
			}else {
				System.out.println("Mensagem enviada com sucesso!");
				return new Mensagem(this);
			}
		}
	}	
}