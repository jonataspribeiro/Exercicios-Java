package Lacocondiconal;

//1. Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int n1, n2, n3;
		
	System.out.print("Digite o 1º Número: ");
	n1 = entrada.nextInt();
	
	System.out.print("Digite o 2º Número: ");
	n2 = entrada.nextInt();
	
	System.out.print("Digite o 3º Número: ");
	n3 = entrada.nextInt();
	
	if(n1 > n2 && n1 > n3) {
		System.out.print("o maior número é: " + n1);			
	}
	
	else if(n2 > n1 && n2 > n3) {
		System.out.print("o maior número é: " + n2);
	}
	
	else if(n3 > n1 && n3 > n1) {
		System.out.print("o maior número é: " + n3);
	}
	
	
	}
}