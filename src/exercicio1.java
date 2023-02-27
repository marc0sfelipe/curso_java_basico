import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a,b,c;
	System.out.println("Digite um numero: ");
	a = sc.nextDouble();
	System.out.println("Digite outro numero: ");
	b = sc.nextDouble();
	c = a + b;
	
	System.out.println("Soma =" + c);	
	sc.close();
	}

}
