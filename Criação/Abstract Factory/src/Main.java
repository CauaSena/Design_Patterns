
final class Main {
	public static void main(String[] args) {

		RelatorioFactory relatorio = new PdfRelatorioFabrica();
		GeradorRelatorio gerar = new GeradorRelatorio(relatorio);

		gerar.exportar();
		
		relatorio = new ExcelRelatorioFabrica();
		gerar = new GeradorRelatorio(relatorio);
		
		gerar.exportar();
	}
}
