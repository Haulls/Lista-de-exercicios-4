package Lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o comprimento da caixa retangular : ");
		float Comprimento =sc.nextFloat();
		System.out.println("Digite a largura da caixa retangular : ");
		float Largura=sc.nextFloat();
		System.out.println("Digite a altura da caixa retangular : ");
		float Altura=sc.nextFloat();
	
		float Volume = Comprimento*Largura*Altura;
	System.out.println("O volume da caixa retangular é : "+Volume);
	
	
	
	
	
	
	sc.close();
	}

}
