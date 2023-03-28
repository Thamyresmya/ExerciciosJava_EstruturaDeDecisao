/* 22.	Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
 * Dica: utilize uma função de arredondamento.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número é inteiro ou decimal: ");
		double num = scan.nextDouble();	
		
		int numero = (int) Math.round(num);		
		
		if(num == numero) {
			System.out.println("O numero é inteiro");
		} else {
			System.out.println("O numero é decimal");
		}	
	}
}
