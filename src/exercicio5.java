import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f, res1;
		System.out.println("Digite o codigo da peça 1");
		a = sc.nextDouble();
		System.out.println("Digite o numero de peças: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor da peça: ");
		c = sc.nextDouble();
		System.out.println("Digite o codigo da peça 2: ");
		d = sc.nextDouble();
		System.out.println("Digite o numero de peças que deseja comprar: ");
		e = sc.nextDouble();
		System.out.println("Digite o valor da peça 2: ");
		f = sc.nextDouble();
		res1 = b * c + e * f;
		
	
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", res1);
		System.out.printf("%f %f",a,d);
				
		
		
		
		sc.close();
	}

}
