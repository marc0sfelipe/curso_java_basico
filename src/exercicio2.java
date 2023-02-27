import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double area, raio, pi;
	System.out.println("Digite o valor do raio ");
	raio = sc.nextDouble();
	pi = 3.14159;
	area = pi * (raio * raio);
	System.out.println(area);
	sc.close();
	}

}
