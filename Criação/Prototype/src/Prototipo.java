import java.util.ArrayList;
import java.util.List;

public class Prototipo extends Servidor{

	public Prototipo(String sistemaOperacional, String memoriaRam, List<String> pacotesInstalados) {
		super(sistemaOperacional, memoriaRam, pacotesInstalados);
	}

	@Override
	public Servidor clonar() {
		List<String> novoPacote = new ArrayList<String>();
		novoPacote.addAll(pacotesInstalados);
		return new Prototipo(sistemaOperacional, memoriaRam, novoPacote);
	}
}
