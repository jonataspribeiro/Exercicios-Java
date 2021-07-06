package br.com.generation.matrizesevetores.exercicios;

import java.util.Scanner;

/* 1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação
de uma atividade e o escreva em seguida. Encontre após a maior pontuação 
e a apresente. */

public class Exercicio01Vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double[] notas = new double[5];
		double soma = 0.0, maior = 0.0;		
				
		System.out.print("Digite as cinco notas da atividade: \n");		
		for(int i = 0; i <= 4; i++) {
			notas[i] = entrada.nextDouble();// Adicionando valores no Vetor.
			soma = soma + notas[i];
									
			if(notas[i] > maior) {
				maior = notas[i];					
			}
		}
		for(int i = 0; i <= 4; i++) {
			System.out.println(notas[i]);
		}			
				
		System.out.println("\nA maior pontuação foi: " + maior);
		
	}

}

