import java.util.Scanner;

public class exer_while_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int senha_digitada=0;
		
		while (senha != senha_digitada) {
			System.out.println("Digite sua senha");
			senha_digitada = sc.nextInt();
			if (senha == senha_digitada) {
				System.out.println("Acesso permitido");
				break;
			} else {
				System.out.println("Senha invalida");
			}
		}
		
		sc.close();
	}
}
