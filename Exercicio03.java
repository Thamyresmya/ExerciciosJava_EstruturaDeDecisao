/*
3.	Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu sexo: F ou M");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (sexo.equalsIgnoreCase("m")){
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		
	}

}
