package br.com.generation.matrizesevetores.exercicios;

import java.util.Scanner;

/* 2 - Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
Fa�a um programa que gere um vetor com os lan�amentos, escreva 
esse vetor. A seguir determine e imprima a m�dia aritm�tica 
dos lan�amentos, contabilize e apresente tamb�m quantas foram 
as ocorr�ncias da maior pontua��o. */

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int[] dados = new int[10];
		int maior = 0, soma = 0;
		double media = 0.0, x = 0.0, contador = 0.0;
		
		System.out.println("Lance o dado 10 vezes e registre os n�meros respectivos: ");
		for(int i = 0; i <=9; i++) {
			dados[i] = ler.nextInt();
			soma = soma + dados[i];
			media = soma / (i+1.0);
			
			if(dados[i] > maior) {
				maior = dados[i];
		
			}
		
		}
		for(int i = 0; i <=9; i++) {
			System.out.print(dados[i] + " | ");
		}
		System.out.println("");		
		System.out.println("\nA m�dia foi: " + media);
		System.out.println("\nO maior n�mero jogado foi: " + maior);
		
	}

}
