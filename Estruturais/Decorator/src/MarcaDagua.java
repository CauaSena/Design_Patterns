
public class MarcaDagua extends VideoDecorator{
	private StreamDeVideo video;
	private String selo = " Com Marca d'água ->";
	
	public MarcaDagua(StreamDeVideo novoVideo) {
		super(novoVideo);
		video = novoVideo;
	}
	
	@Override
	public String processar() {
		return video.processar() + selo;
	}
}
