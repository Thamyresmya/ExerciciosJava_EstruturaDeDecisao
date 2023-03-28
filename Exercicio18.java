/*
18.	Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida
*/

package ExercicioJava_EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma data nesse formato dd/mm/aaaa");
		System.out.println("Digite um dia: ");
		int dia = scan.nextInt();
		System.out.println("Digite um mês: ");
		int mes = scan.nextInt();
		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();
		
		boolean valido = false;
		
		// mes com 31 dias
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {			
			if(dia <= 31) {
	            valido = true;
			}			
		} // mes com 30 dias
		else if( mes == 4 || mes == 6 || mes == 9 || mes == 11) {        
	        if(dia <= 30) {
	        	valido = true;
	        } 
	    } else if (mes == 2) {
	    	//Testa se é bissexto
	        if ((ano % 4 == 0  &&  ano % 100 != 0) || ano % 400 == 0){
	            if(dia <= 29) 
	            	valido = true;	            
	        } else if(dia <= 28) 
	        	valido = true;	        
	    	}   
	    
		if(valido == true) {
	    	System.out.println("Data válida");
	    } else {
	    	System.out.println("Data Inválida");
	    }	

	}
}
