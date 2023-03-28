/*14.	Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
 	e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
		o	  Média de Aproveitamento  Conceito
		o	  Entre 9.0 e 10.0        A
		o	  Entre 7.5 e 9.0         B
		o	  Entre 6.0 e 7.5         C
		o	  Entre 4.0 e 6.0         D
		o	  Entre 4.0 e zero        E
		O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO”
		 se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeiro nota: ");
		double nota1 = scan.nextInt();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextInt();
		
		double media = (nota1 + nota2) / 2;
		String aproveitamento = "";			
		
		if(media >= 9 && media <=10) {
			aproveitamento = "A";
			
		} else if(media >= 7.5 && media < 9) {
			aproveitamento = "B";
			
		} else if(media >= 6 && media < 7.5) {
			aproveitamento = "C";
			
		} else if(media >= 4 && media < 6) {
			aproveitamento = "D";
			
		} else if(media >= 0 && media < 4) {
			aproveitamento = "E";
		}	
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Aproveitamento: " + aproveitamento);
		
		switch (aproveitamento) {
		case "A": 
		case "B": 
		case "C": System.out.println("Conceito: APROVADO"); break;
		case "D": 
		case "E": System.out.println("Conceito: REPROVADO"); break;
		}
		
	}

}