import java.util.Random;

public class Arvore {
	public TipoArvore tipo;
	public int posicaoX, posicaoY, posicaoZ;

	public int saude;
	
	public Arvore(TipoArvore novaArvore) {
		tipo = novaArvore;
		saude = 1;
		gerarPosicao();
	}
	
	public void gerarPosicao() {
		Random aleatorio = new Random();
		
		posicaoX = aleatorio.nextInt(20);
		posicaoY = aleatorio.nextInt(20);
		posicaoZ = aleatorio.nextInt(20);
	}
	
	@Override
	public String toString() {
		return "Árvore de "+ tipo.nomeDaEspécie + " criada em " + posicaoX + " " + posicaoY + " "+ posicaoZ;
	}

}
