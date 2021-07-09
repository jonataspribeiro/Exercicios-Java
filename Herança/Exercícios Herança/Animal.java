package br.com.generation.exerciciosherancapolimorfismo;

/*1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos 
 * (observe a tabela), utilize os seus conhecimentos e distribua as características de forma
 *  que tudo o que for comum a todos os animais fique na classe Animal: 
 *  
 * 2 - Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e 
 * invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do 
 * tipo de animal.*/



public class Animal {
	
	private String possuiNome;
	private int possuiIdade;
	private String deveEmitirSom;
	
	public String getPossuiNome() {
		return possuiNome;
	}
	public void setPossuiNome(String possuiNome) {
		this.possuiNome = possuiNome;
	}
	public int getPossuiIdade() {
		return possuiIdade;
	}
	public void setPossuiIdade(int possuiIdade) {
		this.possuiIdade = possuiIdade;
	}
	public String getDeveEmitirSom() {
		return deveEmitirSom;
	}
	public void setDeveEmitirSom(String deveEmitirSom) {
		this.deveEmitirSom = deveEmitirSom;
	}	
}
