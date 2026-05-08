
public class Main {
	public static void main(String[] args) {

		GerenciadorDePrototipos organizador = new GerenciadorDePrototipos();
		String nome;

		nome = "Maquina do Cliente 1";
		Servidor cliente1 = organizador.novaMaquina("maquina linux", nome);			
		System.out.println(organizador.getWebServers().get(nome).sistemaOperacional);

		nome = "Maquina do Cliente 2";
		Servidor cliente2 = organizador.novaMaquina("maquina windows", nome);			
		System.out.println(organizador.getWebServers().get(nome).sistemaOperacional);

		cliente1.pacotesInstalados.add("PHP");
		cliente2.pacotesInstalados.add("Node.js");

		System.out.println(cliente1.pacotesInstalados);
		System.out.println(cliente2.pacotesInstalados);
	}	
}