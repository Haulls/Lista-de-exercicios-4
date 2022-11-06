package Lista4;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da letra A :");
		int A = sc.nextInt();
		System.out.println("Digite o valor da letra B : ");
		int B = sc.nextInt();
		System.out.println("Digite o valor da letra C : ");
		int C = sc.nextInt();
		
		int soma = A*A+B*B+C*C;
		System.out.println("A soma dos quadrados dos 3 números lidos são : "+soma);
	
	
	
	
	
	sc.close();
	}

}
