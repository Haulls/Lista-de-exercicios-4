package Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o valor de A : ");
	int A = sc.nextInt();
	System.out.println("Digite o valor de B : ");
	int B = sc.nextInt();
	System.out.println("Digite o valor de C : ");
	int	C = sc.nextInt();
	System.out.println("Digite o valor de D : ");
	int	D = sc.nextInt();
		
	
	System.out.println ("A multiplicação de A com B é:"+A*B);

	System.out.println ("A multiplicação de A com C é:"+A*C);
	
	System.out.println ("A multiplicação de A com D é:"+A*D);
	
	System.out.println ("A multiplicacao de B com C é:"+B*C);

	System.out.println ("A multiplicação de B com D é:"+B*D);

	System.out.println ("A multiplicação de C com D é:"+C*D);
		
	System.out.println("E as somas são "+(A+B));
	
	System.out.println("E as somas são "+(A+C));
	
	System.out.println("E as somas são "+(A+D));
	
	System.out.println("E as somas são "+(B+C));
	
	System.out.println("E as somas são "+(B+D));
	
	System.out.println("E as somas são "+(C+D));
	
	
	
	
	
	
	
	sc.close();
		
	}

}
