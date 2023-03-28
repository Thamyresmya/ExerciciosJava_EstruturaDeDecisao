/*
4.	Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = scan.next();
		
		if(letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {			
			switch (letra) {
				case "a":
				case "e":
				case "i":
				case "o":
				case "u":
				case "A":
				case "E":
				case "I":
				case "O":
				case "U": System.out.println("A letra '" + letra + "' é uma vogal"); break;
				default:System.out.println("A letra '" + letra + "' é uma consoante");
			}
		}
	}		
}
