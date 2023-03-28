/*26.	Uma fruteira está vendendo frutas com a seguinte tabela de preços:
			o	                      Até 5 Kg           Acima de 5 Kg
			o	Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
			o	Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
		Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
		receberá ainda um desconto de 10% sobre este total. 
		Escreva um algoritmo para ler a quantidade (em Kg) de morangos
		e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		
		System.out.println("=============== TABELA DE PREÇO ===============");
		System.out.println("		 	Até 5 Kg           Acima de 5 Kg");
		System.out.println("Morango  R$ 2,50 por Kg       R$ 2,20 por Kg");
		System.out.println("Maçã     R$ 1,80 por Kg       R$ 1,50 por Kg");
		System.out.println("================================================");		
		
		System.out.println("Qual a quantidade (em Kg) de morangos: ");
		double kgMorango = scan.nextDouble();
		System.out.println("Qual a quantidade (em Kg) de maça: ");
		double kgMaca = scan.nextDouble();
		
		double totalKg = kgMorango + kgMaca;
		double desconto = 0;
		double precoMorango = 0;
		double precoMaca = 0;
		
		if(kgMorango <= 5) {
			precoMorango = 2.50;
		} else if(kgMorango > 5) {
			precoMorango = 2.20;
		}		
		double valorMorango = kgMorango * precoMorango;		
		
		if(kgMaca <= 5) {
			precoMaca = 1.80;
		} else if(kgMaca > 5) {
			precoMaca = 1.50;			
		}
		double valorMaca = kgMorango * precoMaca;				
		double valorTotal = valorMorango + valorMaca;
		
		if(totalKg >= 8  || valorTotal >= 25) {
			desconto = valorTotal * 0.10;			
		}
		
		System.out.println("=============== COMPROVANTE ===================");
		System.out.println("Quant. (em Kg) ==> Morango : " + kgMorango + " kg" + " ==> R$ " + valorMorango);
		System.out.println("Quant. (em Kg) ==> Maca    : " + kgMaca + " kg" + " ==> R$ " + valorMaca);
		System.out.println("Total (em Kg) de futras    : " + totalKg + " kg");
		System.out.println("Valor total Bruto ==>    R$ " + valorTotal);
		System.out.println("Total de desconto(10%) (-) R$ " + desconto);
		System.out.println("Valor total a pagar ==>    R$ " + (valorTotal - desconto));
		System.out.println("================================================");	
		
	}

}
