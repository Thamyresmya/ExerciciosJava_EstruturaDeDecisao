/*24.	Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
	o	"Telefonou para a vítima?"
	o	"Esteve no local do crime?"
	o	"Mora perto da vítima?"
	o	"Devia para a vítima?"
	o	"Já trabalhou com a vítima?" 
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" e
5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda as seguintes perguntas: 1 - Não ou 2 - Sim:");
		System.out.println("Telefonou para a vítima?");
		int resp1 = scan.nextInt();
		System.out.println("Esteve no local do crime?");
		int resp2 = scan.nextInt();
		System.out.println("Mora perto da vítima?");
		int resp3 = scan.nextInt();
		System.out.println("Devia para a vítima?");
		int resp4 = scan.nextInt();
		System.out.println("Já trabalhou com a vítima?");
		int resp5 = scan.nextInt();
		
		// 7 suspeita
		// 7 cumplice
		// 10 assassino
		int resultado = resp1 + resp2 + resp3 + resp4 + resp5;		
		
		if(resultado == 10) {
			System.out.println("Assassino");
		} else if(resultado == 7) {
			System.out.println("Suspeita");
		} else if(resultado == 8 || resultado == 9) {
			System.out.println("Cúmplice");		
		} else {
			System.out.println("Inocente");
		}		
	}
}
