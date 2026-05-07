public class ExcelRelatorioFabrica extends RelatorioFactory{
		
	@Override
	public Cabecalho criarCabecalho() {
		return new ExcelCabecalho();
	}
	@Override
	public Corpo criarCorpo() {
		System.out.println("Gerando corpo Excel");
		return new ExcelCorpo();
	}
}
