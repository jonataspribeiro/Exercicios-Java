package br.generation.exercicios.repeticao;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
No final, mostre a soma dos números digitados.(DO...WHILE)*/


import java.util.Scanner;

import br.com.generation.funcao.system.FuncaoSystemOut;

public class Exercicio05dowhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			n = ler.nextInt();	
			soma = soma + n;
		}
		while(n != 0);
		
	System.out.print("A soma dos números digitados é igual a: " + soma +".");	
	}	
}