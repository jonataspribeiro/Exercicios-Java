package br.generation.exercicios.repeticao;

/*4 - Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos
de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 
2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se
a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
calcule e mostre: (WHILE)

número de pessoas calmas; 
número de mulheres nervosas; 
número de homens agressivos; 
número de outros calmos;
número de pessoas nervosas com mais de 40 anos; 
número de pessoas calmas com menos de 18 anos.*/


import java.util.Scanner;

public class Exercicio04while {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = 150, idade, sexo, temperamento, pessoacalma = 0, mulhernervosa = 0,
				homemagressivo = 0, outroscalma = 0,totalnervosa = 0, totalcalma = 0;
		
		while(n > 0) {
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.println("\nDigite seu sexo:\n1-Feminino\n2-Masculino\n3-Outros ");
			sexo = ler.nextInt();
			System.out.println("\nDigite:\n1 -Se você é uma pessoa calma\n2 Se você é uma pessoa nervosa\n"
					+ "3 Se você é uma pessoa agressiva");
			temperamento = ler.nextInt();
			System.out.print("\n");
			n-=1;			
						
			if(temperamento == 1 && sexo == 1) {
				pessoacalma+=1;					
			}						
			if(temperamento == 1 && sexo == 2) {
				pessoacalma+=1;					
			}			
			if (temperamento == 1 && sexo == 3) {
				pessoacalma+=1;					
			}					
			if(temperamento == 2 && sexo == 1) {
				mulhernervosa+=1;					
			}
			if(temperamento == 3 && sexo == 2) {
				homemagressivo+=1;			
			}			
			if (temperamento == 1 && sexo == 3) {
				outroscalma+=1;					
			}	
			if (idade > 40 && temperamento == 2) {
				totalnervosa+=1;					
			}
			if (idade < 18 && temperamento == 1) {
				totalcalma+=1;					
			}					
		}
		System.out.println("Total de pessoas calmas: " + pessoacalma);
		System.out.println("Total de mulheres nervosas: " + mulhernervosa);
		System.out.println("Total de homens agressivos: " + homemagressivo);
		System.out.println("Total de outros calmos: " + outroscalma);
		System.out.println("Total pessoas nervosas com mais de 40 anos: " + totalnervosa);
		System.out.println("Total de pessoas calmas com menos de 18 anos: " + totalcalma);				
	}
}