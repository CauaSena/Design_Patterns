import java.util.List;

public abstract class Servidor {
	public String sistemaOperacional;
	public String memoriaRam;
	public List<String> pacotesInstalados;

	public Servidor(String sistemaOperacional, String memoriaRam, List<String> pacotesInstalados) {
		this.sistemaOperacional = sistemaOperacional;
		this.memoriaRam = memoriaRam;
		this.pacotesInstalados = pacotesInstalados;
	}

	public abstract Servidor clonar();

}
