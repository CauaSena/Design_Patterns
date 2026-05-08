import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorDePrototipos{
	private Map<String, Servidor> webServers = new HashMap<String, Servidor>();

	public Map<String, Servidor> getWebServers() {
		return webServers;
	}

	public GerenciadorDePrototipos() {
		Prototipo linux = new Prototipo("Linux Redhat","16 GB",List.of("Apache, Docker"));
		Prototipo windows = new Prototipo("Windows Server 2022","32 GB",List.of("SQL Server"));
		webServers.put("MAQUINA LINUX", linux);
		webServers.put("MAQUINA WINDOWS", windows);
	}

	public Servidor novaMaquina(String tipo, String nome) {
		Servidor novaClonagem = webServers.get(tipo.toUpperCase());
		webServers.put(nome, novaClonagem);
		return novaClonagem.clonar();
	}
}

