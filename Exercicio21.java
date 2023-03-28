/* 21.	Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
   Dica: utilize o operador módulo (resto da divisão).
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Esse número é PAR");
		} else {
			System.out.println("Esse número é ÍMPAR");
		}			
	}
}
