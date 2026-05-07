import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite: \n 1 - Para SMS \n 2 - Para Email \n 3 - Para Push ");
		int id = scan.nextInt();
		scan.close();
		
		Notificacao notificar = Fabrica.criarNotificacao(id);
		System.out.println(notificar.enviarNotificacao());
	}

}
