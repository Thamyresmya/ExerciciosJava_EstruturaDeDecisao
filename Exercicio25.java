/* 25.	Um posto está vendendo combustíveis com a seguinte tabela de descontos:
	o	Álcool: 
		a) até 20 litros, desconto de 3% por litro
		b) acima de 20 litros, desconto de 5% por litro
	o	Gasolina:
		a) até 20 litros, desconto de 4% por litro
		b) acima de 20 litros, desconto de 6% por litro 
	Escreva um algoritmo que leia o número de litros vendidos, 
	o tipo de combustível (codificado da seguinte forma: 
	A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente 
	sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================TABELA DE COMBUSTIVEL==================");
		System.out.println("Qual o tipo de combustivel? Digite: A-álcool, G-gasolina ");
		System.out.println("            A - álcool ");
		System.out.println("            G - gasolina ");		
		System.out.println("=========================================================");
		String comb = scan.next();
		
		System.out.println("Qual a quantidade? ");
		int litros = scan.nextInt();
		
		double precoAlcool = 1.90;
		double precoGasolina = 2.50;
		String combustivel = "";
		double valorBruto = 0;
		double desconto = 0;
		double percentual = 0;
		
		if(comb.equalsIgnoreCase("A")) {
			combustivel = "Álcool";
			valorBruto = litros * precoAlcool;
			
			if(litros <= 20) {	
				percentual = 3;	
			} else if(litros > 20) {
				percentual = 5;				
			}				
			desconto = valorBruto * (percentual/100);
		}		
		if(comb.equalsIgnoreCase("G")) {
			combustivel = "Gasolina";
			valorBruto = litros * precoGasolina;			
			
			if(litros <= 20) {				
				percentual = 4;							
			} else if(litros > 20) {
				percentual = 6;
			}	
			desconto = valorBruto * (percentual/100);
		}
		System.out.println("=============COMPROVANTE=============");
		System.out.println("Combustivel: " + combustivel);
		System.out.println("Quant. litros: " + litros + " Lts");
		System.out.println("Valor Bruto: R$ " + valorBruto);
		System.out.println("Percentual de desconto: " + percentual + "%");
		System.out.println("Desconto de R$ " + desconto);
		System.out.println("O valor a ser pago é de R$ " + (valorBruto - desconto));
		System.out.println("=====================================");
	}
}
