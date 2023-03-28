/* 20.	Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque
 * 		e depois informar quantas notas de cada valor serão fornecidas.
 * 		As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais
 * 		e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
			o	Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
			o	Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============== CAIXA ELETRONICO ===============");
		System.out.println("       Valor mínimo de saque 10 reais           ");
		System.out.println("       Valor máximo de saque 600 reais          ");
		System.out.println("Notas disponíveis R$ 1, 5, 10, 50 e 100         ");
		System.out.println("================================================");			
		
		System.out.println("Qual o valor do SAQUE: R$ ");
		int dinheiro = scan.nextInt();
		
		int n100 = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0;
		
		while (dinheiro != 0) {
			if (dinheiro >= 100) {
	            n100 = dinheiro / 100;
	            dinheiro = dinheiro % 100;
	            System.out.println(n100 + " notas de R$ 100");
	        } else if (dinheiro >= 50) {
	            n50 = dinheiro / 50;
	            dinheiro = dinheiro % 50;
	            System.out.println(n50 + " notas de R$ 50");
	        } else if (dinheiro >= 10) {
	            n10 = dinheiro / 10;
	            dinheiro = dinheiro % 10;
	            System.out.println(n10 + " notas de R$ 10");
	        } else if (dinheiro >= 5) {
	            n5 = dinheiro / 5;
	            dinheiro = dinheiro % 5;
	            System.out.println(n5 + " notas de R$ 5");
	        } else if (dinheiro >= 1) {
	            n1 = dinheiro / 1;
	            dinheiro = dinheiro % 1;
	            System.out.println(n1 + " notas de R$ 1");
	        }
	    }
	}	
}

