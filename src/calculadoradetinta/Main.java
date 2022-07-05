package calculadoradetinta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float n1;
		float n2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Informe a primeira medida?");
		n1 = input.nextInt();
		System.out.println(" Informe a segunda medida?");
		n2 = input.nextInt();
		
		System.out.print("Soma: " + (n1*n2));
	}

}
