/*16.	Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c.
 *  O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário
 *   nas seguintes situações:
		o	Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau
		 	e o programa não deve fazer pedir os demais valores, sendo encerrado;
		o	Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário
		 	e encerre o programa;
		o	Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
		o	Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("========= EQUAÇÃO DO 2º GRAU ==========");
		System.out.println("Digite o valor de a: ");
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("Isso não é uma equação do 2º grau");	
		} else {		
			System.out.println("Digite o valor de b: ");
			int b = scan.nextInt();
			System.out.println("Digite o valor de c: ");
			int c = scan.nextInt();
		
			// ax2 + bx + c = 0
			// delta = b2 - 4ac
			// x' e x" = -b +/- raiz (delta) / 2a
			
			int delta = (b * b) - (4 * a * c);		
				
			if(delta < 0) {
				System.out.println("Delta: " + delta);
				System.out.println("Delta negativo, não possui raizes reais");				
			} else {
				
				System.out.println("Delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("X1: " + x1);
				System.out.println("X2: " + x2);
			}
		}		
	}
}
