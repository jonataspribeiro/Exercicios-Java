package br.generation.exercicios.repeticao;

import java.util.Scanner;

/*3- Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE).*/

public class Exercicio03while {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while(idade != -99) {			
			System.out.print("Digite uma idade: ");
			idade = ler.nextInt();
				
		if(idade < 21 && idade >= 0) {
			menor21 +=1;			
		}
		else if(idade > 50) {
			maior50 +=1;			
		}
	
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + menor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior50);
	}

}
