package br.generation.exercicios.repeticao;

/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/


import java.util.Scanner;

import br.com.generation.funcao.system.FuncaoSystemOut;

public class Exercicio05dowhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n, soma = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			n = ler.nextInt();	
			soma = soma + n;
		}
		while(n != 0);
		
	System.out.print("A soma dos n�meros digitados � igual a: " + soma +".");	
	}	
}