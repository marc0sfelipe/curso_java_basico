import java.util.Scanner;

public class exer_for_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros q voce vai testar o intervalo: ");
		int n = sc.nextInt();
		int in=0, out=0;
		for (int i =0; i<n; i++) {
			int x = sc.nextInt();
			if (x < 10 || x > 20) {
				out += 1;
			} else {
				in += 1;
			}
		} System.out.printf("%d in\n%d out", in,out);
		sc.close();
	}
}
