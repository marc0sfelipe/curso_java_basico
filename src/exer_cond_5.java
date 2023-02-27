import java.util.Scanner;

public class exer_cond_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y;
		System.out.println("Digite o valor de x: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = sc.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}else if (y > 0) {
				if (x>0) {
					System.out.println("Q1");
				} else {
					System.out.println("Q2");
				}
		} else {
				if (x>0) {
					System.out.println("Q4");
				} else {
					System.out.println("Q3");
				}
			}
		sc.close();
	}
}
