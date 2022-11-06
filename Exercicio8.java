package Lista4;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Digite o Primeiro valor : ");
	int A = sc.nextInt();
	
	System.out.println("Digite o Segundo valor : ");
	int B = sc.nextInt();
	
	System.out.println("Digite o terceiro valor :");
	int C = sc.nextInt();
	
	System.out.println("Digite o quarto valor :");
	int D = sc.nextInt();

	int variávelP= A*C;
	
	int variavelS=B+D;
	
	System.out.println("O valor da variável P é : "+variávelP);
	System.out.println("O valor da variável S é : "+variavelS);
	
	
	
	
	sc.close();
	}
}