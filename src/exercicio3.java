import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
	double a,b,c,d, diferenca;
	Scanner sc = new Scanner(System.in);
	a = sc.nextDouble();
	b = sc.nextDouble();
	c = sc.nextDouble();
	d = sc.nextDouble();
	diferenca = a * b - c * d;
	System.out.println("diferenca =" + diferenca);
	
	sc.close();
	}

}
