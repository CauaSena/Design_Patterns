
public class FiltroCompressao extends VideoDecorator{
	private StreamDeVideo video;
	private String descricao = " Compactado ->";
	
	public FiltroCompressao(StreamDeVideo novoVideo) {
		super(novoVideo);
		video = novoVideo;
	}
	
	@Override
	public String processar() {
		return video.processar() + descricao;
	}
}
