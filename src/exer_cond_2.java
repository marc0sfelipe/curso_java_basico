import java.util.Scanner;

public class exer_cond_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite um numero: ");
		x = sc.nextInt();
		if ((x % 2) == 0) {
			System.out.println("par");
				
		} else {
			System.out.println("impar");
		}
		sc.close();
	}

}
