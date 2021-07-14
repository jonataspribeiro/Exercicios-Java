package br.com.genenation.collections.exercicios;

public class EstoqueLoja {
		
		/* 3 - Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.*/
	
	
	//Atributos
	String tipoProduto, nomeProduto;
	int quantidade;
	
	
	//Getters e Setters
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	//Construtores
	public EstoqueLoja() {
		super();		
	}
	
	public EstoqueLoja(String tipoProduto, String nomeProduto, int quantidade) {
		super();
		this.tipoProduto = tipoProduto;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
	}
	
	public String toString() {
		
		return "Tipo: " + this.tipoProduto + " | " + "\t Nome: " + this.nomeProduto + " | " + " \t Quantidade: " + this.quantidade;
	}

}
