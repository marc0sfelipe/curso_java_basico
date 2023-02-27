import java.util.Scanner;

public class exer_cond_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Digite o valor do intervalo: ");
		a = sc.nextDouble();
		if (a < 0 && a > 100) {
			  System.out.println("Fora do intervalo");
			} else if (a > 0 && a < 25.01) {
			  System.out.println("Intervalo (0,25)");
			} else if (a < 50.01) {
			  System.out.println("Intervalo (25,50)");
			} else if (a < 75.01) {
			  System.out.println("Intervalo (50,75)");
			} else {
			  System.out.println("Intervalo (75,100)");
			} 
		sc.close();
	}
}
