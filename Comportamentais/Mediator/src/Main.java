
public class Main {
	public static void main(String[] args) {
		TorreDeControleMediator torreSP = new TorreDeControleMediator("Torre de São Paulo");
	
		Aeronave aviaoDF = new AviaoBrasil("Avião do presidente", torreSP);
		Aeronave aviaoTesla = new AviaoEUA("Avião do Musk", torreSP);
	
		verConfirmacaoDoPouso(aviaoDF);
		verConfirmacaoDoPouso(aviaoTesla);
		
		torreSP.EnviarAviso("Tempestade em SP!!!");
		System.out.println(aviaoDF.avisoDaTorre);
		System.out.println(aviaoTesla.avisoDaTorre);
	}
	
	public static void verConfirmacaoDoPouso(Aeronave a) {
		if (a.solicitarPouso()) {
			System.out.println(a.nome +  " AUTORIZADO");
		}else {
			System.out.println("POUSO NÃO AUTORIZADO!");
		}	
	}
}
