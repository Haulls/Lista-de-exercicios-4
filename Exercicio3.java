package Lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A : ");
		int valorA=sc.nextInt();
		
		System.out.println("Digite o valor de B");
		int valorB=sc.nextInt();
		
		
		int C=valorA-valorB;
		
		System.out.println("O resultado é : "+C*C);
		
		
		
		
		
		
		
		sc.close();
	}
}
