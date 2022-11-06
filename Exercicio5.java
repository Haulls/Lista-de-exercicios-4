package Lista4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos Reais você possui : ");
		Float Dolares = sc.nextFloat(); 
		System.out.println("Digite quanto está a cotação do Real nos Estador Unidos : ");
		Float cotação = sc.nextFloat();
		Float conversão=cotação*Dolares;
		System.out.println("O valor em Dolares que vc possui é : " +conversão);
		
		
		sc.close();
	}

}
