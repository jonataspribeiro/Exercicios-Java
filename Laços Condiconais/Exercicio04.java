package Lacocondiconal;

import java.util.Scanner;

import java.lang.Math;

//4. Faça um programa em que permita a entrada de um número qualquer e exiba se este 
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1, p, r;
		
		System.out.print("Digite um número: ");
		n1 = entrada.nextDouble();
		
		r = Math.sqrt(n1);
		p = Math.pow(n1, 2.0);
		
		if(n1 % 2 == 0) {
			System.out.println(n1 + " é Par!");
			System.out.println("A raiz quadrad de " + n1 + " é: " + r + ".");
		}
		else{
			System.out.println(n1 + " é Ímpar!");
			System.out.println(n1 + " elavado ao quadrado é: " + p + ".");
		}			
	}
}