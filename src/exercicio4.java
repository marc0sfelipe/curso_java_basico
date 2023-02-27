import java.util.Scanner;

public class exercicio4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Digite o numero do funcionario ");
		a = sc.nextDouble();
		System.out.println("Digite o numero de horas trabalhadas ");
		b = sc.nextDouble();
		System.out.println("Digite o valor que o funcionario recebe por hora ");
		c = sc.nextDouble();
		
		d = b * c;
		
		System.out.printf("Number = %.0f Salario = U$ %.2f", a, d);

		sc.close();
		
	}

}
