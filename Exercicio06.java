/*
6.	Faça um Programa que leia três números e mostre o maior deles.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero3 = scan.nextInt();
		
		
		if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior numero é o primeiro: " + numero1);
		} else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O maior numero é o segundo: " + numero2);
		} else {
			System.out.println("O maior numero é o terceiro: " + numero3);
		}		
		
	}

}
