import java.util.Scanner;

public class exer_cond_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		System.out.println("Digite um numero: ");
		A = sc.nextInt();
		System.out.println("Digite outro numero: ");
		B = sc.nextInt();
		if (A > B) {
			if ((A % B) == 0) {
				System.out.println("Sao multiplos");
			} else {
				System.out.println("Nao sao multiplos");
			}
		} else {
			if ((B % A) == 0) {
				System.out.println("Sao multiplos");
			} else {
				System.out.println("Nao sao multiplos");
		}
		sc.close();
		}	
    }
}
		

