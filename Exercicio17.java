/*  17.	Faça um Programa que peça um número correspondente
 a um determinado ano e em seguida informe se este ano é ou não bissexto.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = scan.nextInt();
		
		// multiplo de 400
		// multiplos de 4
		// nao é multiplo de 100			
		
		if((ano % 4 == 0  &&  ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("Esse ano é Bissexto.");
		} else {
			System.out.println("Esse ano Não é Bissexto.");
		}		
	}
}

