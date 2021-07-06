package br.com.generation.matrizesevetores.exercicios;

import java.util.Scanner;

/* 4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
diagonal, ou seja, diagonal principal. */

public class Exercicio04Matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int[][] matriz = new int[3][3];
		int l, c, soma = 0;
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				System.out.print("Digite um número da Matriz: ");
				matriz[l][c] = ler.nextInt();				
			}
		
		}
		soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma da diagonal da Matriz é: " + soma);
	}

}
