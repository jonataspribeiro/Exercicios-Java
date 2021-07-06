package br.com.generation.matrizesevetores.exercicios;

import java.util.Scanner;

/* 2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva 
esse vetor. A seguir determine e imprima a média aritmética 
dos lançamentos, contabilize e apresente também quantas foram 
as ocorrências da maior pontuação. */

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int[] dados = new int[10];
		int maior = 0, soma = 0;
		double media = 0.0, x = 0.0, contador = 0.0;
		
		System.out.println("Lance o dado 10 vezes e registre os números respectivos: ");
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
		System.out.println("\nA média foi: " + media);
		System.out.println("\nO maior número jogado foi: " + maior);
		
	}

}
