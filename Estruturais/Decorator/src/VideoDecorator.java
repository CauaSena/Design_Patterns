
public abstract class VideoDecorator implements StreamDeVideo {
	private StreamDeVideo video;
	private String descricao;
	
	public VideoDecorator(StreamDeVideo novoVideo) {
		video = novoVideo;
	}
	
	@Override
	public String processar() {
		return video.processar() + descricao;
	}
}