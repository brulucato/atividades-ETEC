package bruna;

import java.util.Scanner;

public class NumPar {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Informe um número: ");
		num = sn.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é par.");
		} else {
			System.out.println("É impar");
		}
		
		sn.close();

	}
}
