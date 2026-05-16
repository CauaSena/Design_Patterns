
public class VisitanteExportadorXML implements VisitorOperacao {
	
	@Override
	public void visitar(ProdutoImportado p) {
		System.out.println("PRODUTO IMPORTADO - XML do(a) " + p.nome + " enviado com sucesso");
	}
	
	@Override
	public void visitar(ProdutoNacional p) {
		System.out.println("PRODUTO NACIONAL - XML do(a) " + p.nome + " importado com sucesso");
	}
	
	@Override
	public void visitar(ServicoDigital s) {
		System.out.println("SERVIÇO DIGITAL - XML do(a) " + s.nome + " importado com sucesso");
	}
}
