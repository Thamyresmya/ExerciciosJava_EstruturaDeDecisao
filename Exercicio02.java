/*
2.	Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor = scan.nextInt();
		
		if(valor < 0) {
			System.out.println("Este numero é negativo.");
		} else {
			System.out.println("Este numero é positivo.");
		}		
		
	}

}
