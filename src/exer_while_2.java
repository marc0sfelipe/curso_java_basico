import java.util.Scanner;

public class exer_while_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x=1,y=1;
		while (x != 0 && y != 0) {
			System.out.println("Digite o valor de x: ");
			x = sc.nextDouble();
			System.out.println("Digite o valor de y: ");
			y = sc.nextDouble();
			if (y > 0) {
				if (x>0) {
					System.out.println("Primeiro");
				} else {
					System.out.println("Segundo");
			
				}
		} else {
				if (x>0) {
					System.out.println("Quarto");
				} else {
					System.out.println("Terceiro");
				}
			}
		
	}sc.close();
  }

}
