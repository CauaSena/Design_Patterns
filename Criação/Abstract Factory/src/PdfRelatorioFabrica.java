
public class PdfRelatorioFabrica extends RelatorioFactory{
	
	@Override
	public Cabecalho criarCabecalho() {
		return new PdfCabecalho();
	}
	@Override
	public Corpo criarCorpo() {
		System.out.println("Gerando corpo PDF");
		return new PdfCorpo();
	}
}
