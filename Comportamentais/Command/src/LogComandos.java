import java.util.ArrayList;
import java.util.List;

public class LogComandos {
	private static Comando comandos;
	static List<Comando> logs = new ArrayList<Comando>();
	
	static void registrarComando(Comando novoComando) {
		comandos = novoComando;
		logs.add(comandos);
	}
	
	
}
