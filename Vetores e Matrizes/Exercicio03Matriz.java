package br.com.generation.matrizesevetores.exercicios;

import java.util.Scanner;

/* 3 - Escreva um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2. */

public class Exercicio03Matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[][] n1 = new double[4][6]; 
		double[][] n2 = new double[4][6];
		double[][] m1 = new double[4][6]; 
		double[][] m2 = new double[4][6];
		
		for(int l = 0; l < n1.length; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print("Entre com N1: ");
				n1[l][c] = ler.nextInt();
				System.out.print("Entre com N2: ");
				n2[l][c] = ler.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];

			}
			System.out.println("________________");
		}		
		System.out.print("===Matriz M1====\n");

		for(int l = 0; l < n1.length ; l++) {
			for(int c = 0; c < n1[l].length; c++) {
				System.out.print(m1[l][c]+ " | ");	
			}
			System.out.print("\n");

		}		
		System.out.print("\n===Matriz M2====\n");

		for(int l = 0; l < n2.length; l++) {
			for(int c = 0; c < n2[l].length; c++) {
				System.out.print(m2[l][c]+ " | ");	
			}
			System.out.println("");
		}
		ler.close();
	}
}