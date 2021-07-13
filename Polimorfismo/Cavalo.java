package br.com.generation.exercicioPolimorfismo;

public class Cavalo implements Animal {

	@Override
	public void nome() {
		System.out.println("Bartolomeu");
		
	}

	@Override
	public void idade() {
		System.out.println("9");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Relicho");
		
	}

	
}
