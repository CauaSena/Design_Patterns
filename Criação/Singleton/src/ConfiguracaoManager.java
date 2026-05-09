import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoManager {
	private volatile static ConfiguracaoManager instancia;
	private Properties configs = new Properties();

	public Properties verConfigs() {
		return configs;
	}

	public static ConfiguracaoManager getInstancia() {
		if (instancia == null) {
			synchronized (ConfiguracaoManager.class) {
				if (instancia == null) {
					instancia = new ConfiguracaoManager();
				}
			} 
			System.out.println("Config criada");
			return instancia;
		}
		else {
			System.out.println("Config acessada");
			return instancia;
		}		}

	private ConfiguracaoManager() {
		System.out.println("Criando a config");
		try {
			FileInputStream leitor = new FileInputStream("src/config.properties");
			configs.load(leitor);
			leitor.close();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
