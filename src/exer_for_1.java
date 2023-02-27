import java.util.Scanner;

public class exer_for_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero entre 1 e 1000");
		int x = sc.nextInt();
		for (int i = 1; i<=x; i++)
			if (i % 2 != 0) {
				System.out.println(i);
			}
		
		sc.close();
	}
}
