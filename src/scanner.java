import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		System.out.println("Digite um numero");
		y=sc.nextInt();
		System.out.println("Digite uma palavra");
		x=sc.next();
		System.out.println("Voce digitou a palavra " + x);
		System.out.println("Voce digitou o numero " + y);
		sc.close();
	}

}
