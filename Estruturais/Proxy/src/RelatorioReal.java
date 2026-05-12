
public class RelatorioReal implements InterfaceRelatorio{
	public String nomeRelatorio;
	
	public RelatorioReal(String nome) {
		nomeRelatorio = nome;
	}
	
	@Override
	public String exibir(String nomeDoRelatorio) {
		return nomeRelatorio;
	}
}
