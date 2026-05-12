
public class Main {
	public static void main(String[] args) {
		InterfaceRelatorio relatorio = new RelatorioProxy("senha_ADMIN");
		System.out.println(relatorio.exibir("Relatorio Pesquisa 2026"));
		
		relatorio = new RelatorioProxy("senha_ADMIN");
		System.out.println(relatorio.exibir("Relatorio Pesquisa 2025"));
		
		relatorio = new RelatorioProxy("senha_ADMIN");
		System.out.println(relatorio.exibir("Relatorio Pesquisa 2026"));
		
		relatorio = new RelatorioProxy("senha");
		System.out.println(relatorio.exibir("Relatorio Pesquisa 2026"));
	}
}
