/*
1.	Faça um Programa que peça dois números e imprima o maior deles.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior numero é o primeiro: " + numero1);
		} else {
			System.out.println("O maior numero é p segundo: " + numero2);
		}			
	}
}
