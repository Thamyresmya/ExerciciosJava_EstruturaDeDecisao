/* 27.	O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
			o	                      Até 5 Kg           Acima de 5 Kg
			o	File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
			o	Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
			o	Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
porém não há limites para a quantidade de carne por cliente. 
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. 

Escreva um programa que peça o tipo e a quantidade de carne comprada pelo 
usuário e gere um cupom fiscal, contendo as informações da compra: tipo e 
quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("=============== TABELA DE PREÇO ===============");
		System.out.println("		 	 Até 5 Kg          Acima de 5 Kg");
		System.out.println("File Duplo  R$ 4,90 por Kg    R$ 5,80 por Kg");
		System.out.println("Alcatra     R$ 5,90 por Kg    R$ 6,80 por Kg");
		System.out.println("Picanha     R$ 6,90 por Kg    R$ 7,80 por Kg");
		System.out.println("================================================");		
		
		System.out.println("Qual o tipo de carne deseja comprar? Digite: ");
		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipoCarne = scan.nextInt();

		System.out.println("Qual a quantidade (em Kg): ");
		double kgCarne = scan.nextDouble();		
		
		System.out.println("Qual a forma de pagamento? Digite: ");
		System.out.println("1 - Cartão Tabajara");
		System.out.println("2 - Dinheiro");
		System.out.println("3 - Outro Cartão");
		int pagamento = scan.nextInt();		
		
		double desconto = 0;
		double precoCarne = 0;
		String nomeCarne = "";
		String tipoPagamento = "";
		double valorCarne = 0;
			
		if(tipoCarne == 1) {
			nomeCarne = "File Duplo";
			if(kgCarne <= 5) {
				precoCarne = 4.90;
			} else if(kgCarne > 5) {
				precoCarne = 5.80;
			}		
		}
		
		if(tipoCarne == 2) {
			nomeCarne = "Alcatra";
			if(kgCarne <= 5) {
				precoCarne = 5.90;
			} else if(kgCarne > 5) {
				precoCarne = 6.80;
			}		
		}
		
		if(tipoCarne == 3) {
			nomeCarne = "Picanha";
			if(kgCarne <= 5) {
				precoCarne = 6.90;
			} else if(kgCarne > 5) {
				precoCarne = 7.80;
			}		
		}		
		
		valorCarne = kgCarne * precoCarne;
			
		if(pagamento == 1) {
			tipoPagamento = "Cartão Tabajara";
			desconto = valorCarne * 0.05;			
		} else if(pagamento == 2) {
			tipoPagamento = "Dinheiro";
		} else if(pagamento == 2) {
			tipoPagamento = "Outro Cartão";
		} 
		
		System.out.println("=============== CUPOM FISCAL ===================");
		System.out.println("Tipo da Carne  ==> " + nomeCarne);
		System.out.println("Quant. (em Kg) ==> " + kgCarne);	
		System.out.println("Forma de pagamento ==> " + tipoPagamento);	
		System.out.println("Valor Bruto    ==> R$ " + valorCarne);
		System.out.println("Total de desconto(5%) (-) R$ " + desconto);
		System.out.println("Valor Liquido ==>    R$ " + (valorCarne - desconto));
		System.out.println("================================================");			
		
	}

}
