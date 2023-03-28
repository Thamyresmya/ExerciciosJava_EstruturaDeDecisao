/*19.	Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
	o	Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
	o	326 = 3 centenas, 2 dezenas e 6 unidades
	o	12 = 1 dezena e 2 unidades 
Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro menor ate 999: ");
		int num = scan.nextInt();
		
		
		int u = num / 1 % 10;
		int d = num / 10 % 10;
		int c = num / 100  % 10;	
		
		if(num >= 100 && num <= 999) {
			System.out.println(c + " centanas, " + d + " dezenas e " + u + " unidades.");
		} else if (num <= 99 && num >= 10) {
			System.out.println(d + " dezenas e " + u + " unidades.");
		} else if (num <= 9) {
			System.out.println(u + " unidades.");
		} else {
			System.out.println("Numero invalido");
		}
		
	}

}
