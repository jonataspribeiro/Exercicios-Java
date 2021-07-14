package br.com.genenation.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControlaEstoque {

	public static void main(String[] args) {
		
		//teclado
		Scanner ler = new Scanner(System.in);
				
		//Iniciando array
		ArrayList<EstoqueLoja> estoque = new ArrayList<>();
				
		//Variáveis que vão receber os valores
		String tipoProdut, nomeProdut;
		int quantProdut, numProdutosAdd, deletProduto;
				
		System.out.println("Deseja adicionar quantos produtos na sua lista? ");
		numProdutosAdd = ler.nextInt();
				
		System.out.println();
		System.out.println("===============CADASTRO DE PRODUTOS==============");
		System.out.println();
				
		//For ---> Iniciado com a qtde informada pelo usuário
		for (int i = 0; i < numProdutosAdd; i++) {
			System.out.println();
			System.out.println((i+1) + "° PRODUTO");
			System.out.println("Tipo: ");
			tipoProdut = ler.next();
					
			//Pulando linha
			ler.nextLine();
					
			System.out.println("Nome: ");
			nomeProdut = ler.next();
					
			//Pulando linha
			ler.nextLine();
					
			System.out.println("Quantidade: ");
			quantProdut = ler.nextInt();
					
			//Preenchendo array
			estoque.add(new EstoqueLoja(tipoProdut, nomeProdut, quantProdut));
					
		}//Fim do for
				
		System.out.println();
		System.out.println("===============EXIBINDO PRODUTOS===============");
		System.out.println();
				
		for (EstoqueLoja i: estoque) {
								
			System.out.println(i);
					
		}
				
			System.out.println();
			System.out.println("===============REMOVER PRODUTOS===============");
			System.out.println();
				
			System.out.println("Digite a posição do Produto a ser deletado:");
			deletProduto = ler.nextInt();
				
			estoque.remove(deletProduto-1);
				
			System.out.println();
			System.out.println("===============EXIBINDO PRODUTOS ATUALIZADOS===============");
			System.out.println();
				
			Collections.shuffle(estoque);
		for (EstoqueLoja i: estoque) {
					
			System.out.println(i);
					
		}
				
		ler.close();
	}

}
