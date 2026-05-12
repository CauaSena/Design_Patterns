import java.util.HashMap;
import java.util.Map;

public class RelatorioProxy implements InterfaceRelatorio{
	private String senha;
	private RelatorioReal relatorio;
	
	static Map<String, RelatorioReal> listaRelatorios = new HashMap<String, RelatorioReal>();
	
	public RelatorioProxy(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String exibir(String nomeNovoRelatorio) {
		if (verificarAcesso(senha)) {
			if (!listaRelatorios.containsKey(nomeNovoRelatorio)) {
				listaRelatorios.put(nomeNovoRelatorio, relatorio = new RelatorioReal(nomeNovoRelatorio));
				System.out.println("Criado com sucesso");
			}

			relatorio = listaRelatorios.get(nomeNovoRelatorio);
			return "Abrindo " + relatorio.exibir(relatorio.nomeRelatorio);
		} 
		else {
			return "Só usuários ADMIN podem gerar relatórios";
		}
	}

	private boolean verificarAcesso(String senhaDoUser) {
		String senhaAdmin = "Senha_ADMIN"; 
		if (senhaDoUser.toLowerCase().contains(senhaAdmin.toLowerCase())) {
			return true;
		} else {
			return false;
		}
	}
}
