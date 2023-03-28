/* 23.	Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
 * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
		o	par ou ímpar;
		o	positivo ou negativo;
		o	inteiro ou decimal.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Qual operação deseja realizar: ");
		System.out.println("Digite 1 - soma");
		System.out.println("Digite 2 - subtrair");
		System.out.println("Digite 3 - multiplicar");
		System.out.println("Digite 4 - dividir");
		int operacao = scan.nextInt();
		
		double resutaldo = 0;
		boolean valida = true;
		
		switch (operacao) {
		case 1: resutaldo = num1 + num2; break;
		case 2: resutaldo = num1 - num2; break;
		case 3: resutaldo = num1 * num2; break;
		case 4: resutaldo = num1 / num2; break;	
		default: System.out.println("Operação inválida!"); 
				valida = false; 	
		}
		
		if(valida) {
			System.out.println("Resultado:" + resutaldo); 
			
			if(resutaldo >=0 ) {
				System.out.println("Resultado POSITIVO"); 
			} else {
				System.out.println("Resultado NEGATIVO"); 
			}
			
			if(resutaldo % 2 == 0 ) {
				System.out.println("Resultado PAR"); 
			} else {
				System.out.println("Resultado ÍMPAR"); 
			}
			
			int numero = (int) Math.round(resutaldo);		
			
			if(resutaldo == numero) {
				System.out.println("O numero é INTEIRO");
			} else {
				System.out.println("O numero é DECIMAL");
			}		
		}		
	}
}
