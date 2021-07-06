package br.generation.exercicios.repeticao;

/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class Exercicio06dowhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n, soma = 0, c = 0;
		
		do {
			System.out.print("Digite um número: ");
			n = ler.nextDouble();
			
			if(n % 3 == 0 && n != 0) {
				soma+=n;
				c+=1;
			}			
		}
		while(n != 0);		
		
		System.out.print("A média dos múltiplos de 3 digitados é: " + soma/c);	
	}	
}