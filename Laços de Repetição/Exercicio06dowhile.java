package br.generation.exercicios.repeticao;

/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class Exercicio06dowhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n, soma = 0, c = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			n = ler.nextDouble();
			
			if(n % 3 == 0 && n != 0) {
				soma+=n;
				c+=1;
			}			
		}
		while(n != 0);		
		
		System.out.print("A m�dia dos m�ltiplos de 3 digitados �: " + soma/c);	
	}	
}