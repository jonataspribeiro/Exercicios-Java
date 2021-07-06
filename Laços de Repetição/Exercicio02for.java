package br.generation.exercicios.repeticao;

//2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.(FOR)

import java.util.Scanner;


public class Exercicio02for {

	public static void main(String[] args) {
		
		int c, par = 0, impar = 0, num;
		
		Scanner ler = new Scanner(System.in);
		
		for(c = 1; c <= 10; c++) {
			
			System.out.print("Digite um número: ");
			num = ler.nextInt();
			
			if (num % 2 == 0) {
				par+=1;
			}
			
			else {
				impar+=1;
			}			
		}		
		System.out.println("O total de pares digitados foi: " + par);
		System.out.println("O total de ímpares digitados foi: " + impar);		
	}
}