
public class Main {
public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Jonas", 2100.0, 0.0);
		Cliente cliente2 = new Cliente("Marcos", 1100.0, 100.0);
		
		SecretariaDeCreditoFacade banco = new SecretariaDeCreditoFacade(cliente1);
		banco.solicitarEmprestimo(4000, "Jonas");
		banco = new SecretariaDeCreditoFacade(cliente2);
		banco.solicitarEmprestimo(4000, "Marcos");
	}
}
