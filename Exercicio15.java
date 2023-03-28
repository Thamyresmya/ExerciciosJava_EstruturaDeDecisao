/*15.	Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores
  		 podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero,
  		 isósceles ou escaleno.
			Dicas:
			o	Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
			o	Triângulo Equilátero: três lados iguais;
			o	Triângulo Isósceles: quaisquer dois lados iguais;
			o	Triângulo Escaleno: três lados diferentes;
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Digite o segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Digite o terceiro lado: ");
		double lado3 = scan.nextDouble();
		
		double soma1 = lado1 + lado2;
		double soma2 = lado3 + lado2;
		double soma3 = lado1 + lado3;
		
		if(soma1 > lado3 && soma2 > lado1 && soma3 > lado2) {
			
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			}
			else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			}
			else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triângulo Escaleno");
			}
			
		} else {
			System.out.println("Isso não é um triângulo");
		}
				
	}

}

