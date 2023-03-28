/*
8.	Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
sabendo que a decisão é sempre pelo mais barato.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto: ");
		double prod1 = scan.nextDouble();
		System.out.println("Digite o preço do segundo produto: ");
		double prod2 = scan.nextDouble();
		System.out.println("Digite o preço do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		if(prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("Compre o produto 1. É mais barato R$ " + prod1);
		} else if(prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("Compre o produto 2. É mais barato R$ " + prod2);
		} else 
			System.out.println("Compre o produto 3. É mais barato R$ " + prod3);
		}
}
