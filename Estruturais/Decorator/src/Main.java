
public class Main {
	public static void main(String[] args) {
		VideoDecorator videoCriptografado = new FiltroCriptografia(new VideoBruto());
		VideoDecorator videoCompactado = new FiltroCompressao(new VideoBruto());
		VideoDecorator videoMarcadagua= new MarcaDagua(new VideoBruto());		
		VideoDecorator videoCompleto = new MarcaDagua(new FiltroCriptografia(new FiltroCompressao(new VideoBruto())));
		
		VideoDecorator[] listaVideos = {videoCriptografado,videoCompactado,videoMarcadagua,videoCompleto};
		for (int i = 0; i < listaVideos.length; i++) {
			System.out.println(listaVideos[i].processar() + " Finalizado");			
		}
	}
}
