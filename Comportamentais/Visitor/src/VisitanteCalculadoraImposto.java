
public class VisitanteCalculadoraImposto implements VisitorOperacao{
	
	@Override
	public void visitar(ProdutoImportado p) {
		System.out.println("Valor inicial: " + String.format("%.2f", p.precoProduto));
		
		double valorComDescontoImposto;
		if (p.precoProduto <= 250.00) {
			valorComDescontoImposto = p.precoProduto - (p.precoProduto * p.imposto);			
		} else {
			double novoImposto = p.imposto + 0.36;
			valorComDescontoImposto = p.precoProduto - (p.precoProduto * novoImposto);
		}
		System.out.println("Valor Final: " + String.format("%.2f", valorComDescontoImposto));
	}

	@Override
	public void visitar(ProdutoNacional p) {
		System.out.println("Valor Inicial: " + String.format("%.2f", p.precoProduto));
		
		double valorComDescontoImposto = p.precoProduto - (p.precoProduto * p.imposto);
		System.out.println("Valor Final: " + String.format("%.2f", valorComDescontoImposto));
	}
	
	@Override
	public void visitar(ServicoDigital s) {
		System.out.println("Valor Inicial: " + String.format("%.2f", s.precoProduto));
		
		double valorComDescontoImposto = s.precoProduto - (s.precoProduto * 0.26);
		System.out.println("Valor Final: " + String.format("%.2f", valorComDescontoImposto));
	}
}
