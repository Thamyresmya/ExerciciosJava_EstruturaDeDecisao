/*12.	Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
		o	Desconto do IR:
		o	Salário Bruto até 900 (inclusive) - isento
		o	Salário Bruto até 1500 (inclusive) - desconto de 5%
		o	Salário Bruto até 2500 (inclusive) - desconto de 10%
		o	Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
		o	        Salário Bruto: (5 * 220)        : R$ 1100,00
		o	        (-) IR (5%)                     : R$   55,00  
		o	        (-) INSS ( 10%)                 : R$  110,00
		o	        FGTS (11%)                      : R$  121,00
		o	        Total de descontos              : R$  165,00
		        	Salário Liquido                 : R$  935,00
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor por hora: R$ ");
		int valorHora = scan.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		int quantHora = scan.nextInt();
		
		double salario = valorHora * quantHora;
		int percentual = 0;
		
		if(salario <= 900) {
			percentual = 0;
			
		} else if(salario > 900 && salario <= 1500) {
			percentual = 5;
			
		} else if(salario > 1500 && salario <= 2500) {
			percentual = 10;
			
		} else if(salario > 2500) {
			percentual = 20;
		}
		
		double inss = salario * 0.10;
		double ir = salario/100 * percentual;
		double sindicato = salario * 0.03;
		double fgts = salario * 0.11;
		double desconto = inss + sindicato + ir;
		double salarioLiquido = salario - desconto;		
		
		System.out.println("Salário Bruto (" + valorHora + "*" + quantHora + ")== R$ " + salario);
		System.out.println("	(-) SINDICATO (3%)== R$ " + sindicato);
		System.out.println("	(-) IR (" + percentual + "%) == R$ " + ir);
		System.out.println("	(-) INSS (10%)== R$ " + inss);
		System.out.println("	FGTS (11%) == R$ " + fgts);
		System.out.println("Total de descontos == R$ " + desconto);
		System.out.println("Salário Liquido == R$ " + salarioLiquido);		
		
	}

}
