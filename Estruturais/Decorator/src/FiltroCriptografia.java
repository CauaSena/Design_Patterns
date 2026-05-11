
public class FiltroCriptografia extends VideoDecorator {
	private StreamDeVideo video;
	private String descricao = " Criptografado ->";
	
	public FiltroCriptografia(StreamDeVideo novoVideo) {
		super(novoVideo);
		video = novoVideo;
	}
	
	@Override
	public String processar() {
		return video.processar() + descricao;
	}
}

