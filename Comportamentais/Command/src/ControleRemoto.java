public class ControleRemoto {
	Luz luzSala = new Luz();
	ArCondicionado arSala = new ArCondicionado();
	Portao portao = new Portao();

	public Comando ligarLuzBtn = new LigarLuz(luzSala);
	public Comando desligarLuzBtn = new DesligarLuz(luzSala);

	public Comando aumentarTempBtn = new AumentarTemp(arSala);
	public Comando diminuirTempBtn = new DiminuirTemp(arSala);
	public Comando abrirPortaoBtn = new AbrirPortao(portao); 
	public Comando fecharPortaoBtn = new FecharPortao(portao);

	public void click(Comando btn) {
		btn.executar();
		LogComandos.registrarComando(btn);
	}

	public void clickVoltarAcao() {
		if (!LogComandos.logs.isEmpty()) {
			Comando desfazerAcao = LogComandos.logs.remove(LogComandos.logs.size()-1);
			desfazerAcao.desfazer();
		}	
	}

}
