package Lacocondiconal;

import java.util.Scanner;

//2 - Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio02 {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		n1 = ler.nextDouble();
		
		System.out.print("Digite o 2º número: ");
		n2 = ler.nextDouble();
		
		System.out.print("Digite o 3º número: ");
		n3 = ler.nextDouble();
		
		 if(n1 < n2) {
			 if(n2 < n3) {
				 System.out.println(n1 + "\n" + n2 + "\n" + n3);
	         }
	         else if(n1 < n3) {
	        	 System.out.println(n1 + "\n" + n3 + "\n" + n2);
	         }
	         	else {
	         		System.out.println(n3 + "\n" + n1 + "\n" + n2);
	         }
		 }      
		 else if(n2 < n3) {
			 if(n1 < n3) {
				 System.out.println(n2 + "\n" + n1 + "\n" + n3);
			 }
			 	else {
			 		System.out.println(n2 + "\n" + n3 + "\n" + n1); 
			 }			 
		 }
		 else {
			 System.out.println(n3 + "\n" + n2 + "\n" + n1);  
		}
				 
	}

}
