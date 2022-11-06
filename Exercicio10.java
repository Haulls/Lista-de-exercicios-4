package Lista4;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de vostos validos para o candidato A :");
		int CandidatoA = sc.nextInt();
		
		System.out.println("Quantidade de vostos validos para o candidato B : ");
		int CandidatoB = sc.nextInt();
		
		System.out.println("Quantidade de vostos validos para o candidato C : ");
		int CandidatoC = sc.nextInt();
		
		System.out.println("Quantidade de votos nulos : ");
		int nulos = sc.nextInt();
		
		
		System.out.println("Quantidade de votos em branco : " );
		int branco = sc.nextInt();
		
		int votovalidos =  CandidatoA +  CandidatoB +CandidatoC;
		int totaleleitores = votovalidos + nulos + branco;
		
		
		int votostotais = (votovalidos * 100) / totaleleitores;
		
		int ValidoA = (CandidatoA * 100) / totaleleitores;
		int    ValidoB= (CandidatoB * 100) / totaleleitores;
		int    ValidoC =(CandidatoC * 100) / totaleleitores;
		 int   percNulo = (nulos * 100) / totaleleitores;
		 int   percBranco = (branco * 100) / totaleleitores; 
		
		System.out.println("O votos totais foram de : "+votostotais);
		System.out.println("O numeros de votos que o candidato A recebeu foi de : "+ValidoA);
		System.out.println("O numeros de votos que o candidato B recebeu foi de : "+ValidoB);
		System.out.println("O numeros de votos que o candidato C recebeu foi de : "+ValidoC);
		System.out.println ("O numero de votos em branco foi de : " +percBranco);
		System.out.println("O numero de votos nulos foi de : "+percNulo);

		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
