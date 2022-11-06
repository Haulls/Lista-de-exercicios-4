package Lista4;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário : ");
		Double SM=sc.nextDouble();
		
		System.out.println("Informe o percentual de Reajuste : ");
		Double PR = sc.nextDouble();
		
		Double NS=SM*PR/100;
		
		System.out.println("Esse é o novo salário : "+NS);
		
	sc.close();
		
	}

}
