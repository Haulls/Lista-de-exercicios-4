package Lista4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos dolares você possui : ");
		Float Dolares = sc.nextFloat(); 
		System.out.println("Digite quanto está a cotação do dolar no Brasil : ");
		Float cotação = sc.nextFloat();
		Float conversão=cotação*Dolares;
		System.out.println("O valor em Reais que vc possui é : " +conversão);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
