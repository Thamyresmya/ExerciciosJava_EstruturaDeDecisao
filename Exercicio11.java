/*
11.	As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram
 	para desenvolver o programa que calculará os reajustes.
	o	Faça um programa que recebe o salário de um colaborador e o reajuste segundo o 
			seguinte critério, baseado no salário atual:
		o	salários até R$ 280,00 (incluindo) : aumento de 20%
		o	salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		o	salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		o	salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
		o	o salário antes do reajuste;
		o	o percentual de aumento aplicado;
		o	o valor do aumento;
		o	o novo salário, após o aumento.*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu salário R$ ");
		double salario = scan.nextDouble();
			
		int percentual = 0;
		
		if(salario <= 280) {
			percentual = 20;			
						
		} else if(salario > 280 && salario <= 700) {
			percentual = 15;	
			
		} else if(salario > 700 && salario <= 1500) {
			percentual = 10;	
			
		} else if(salario > 1500) {
			percentual = 5;	

		}
		
		double aumento = (salario * percentual)/100;
		double novoSalario = salario + aumento;
		
		System.out.println("Seu salario anterior era de R$ " + salario);
		System.out.println("O percentual do reajuste foi de " + percentual + "%");
		System.out.println("O aumento foi de R$ " + aumento);
		System.out.println("O novo salario é de R$ " + novoSalario);
	}

}
