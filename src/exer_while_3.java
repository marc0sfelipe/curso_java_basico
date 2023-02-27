import java.util.Scanner;

public class exer_while_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool=0, gasolina=0, diesel=0,usuario = 0;
	
		
		while (usuario >= 0) {
			usuario = sc.nextInt();
			if (usuario == 1) {
				alcool += 1;
			} else if (usuario == 2) {
				gasolina += 1;
			} else if (usuario == 3) {
				 diesel += 1;
			} else if (usuario == 4) {
				break;
			} 
			
		} 
		
		System.out.printf("MUITO OBRIGADO \n Alcool: %d\n Gasolina: %d\n Diesel: %d\n", alcool,gasolina,diesel);
		
		sc.close();
	}
}
