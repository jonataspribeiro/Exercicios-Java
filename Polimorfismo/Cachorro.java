package br.com.generation.exercicioPolimorfismo;

public class Cachorro implements Animal {

	@Override
	public void nome() {
		System.out.println("Alfredo");
		
	}

	@Override
	public void idade() {
		System.out.println("7");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Latido");
		
	}

	
	
}
