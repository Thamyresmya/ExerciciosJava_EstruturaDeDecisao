/*
 10.	Faça um Programa que pergunte em que turno você estuda. 
		 Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		 Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
		 ou "Valor Inválido!", conforme o caso.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual turma você estuda? Digite: ");
		System.out.println("M-Matutino ou V-Vespertino ou N- Noturno");
		String turma = scan.next();
		
		switch (turma) {
		case "m": 
		case "M": System.out.println("Bom dia!");break;
		case "v": 
		case "V": System.out.println("Boa Tarde!");break;
		case "n": 
		case "N": System.out.println("Boa Noite!");break;
		default: System.out.println("Valor Inválido!");
		
		}
	}
}
