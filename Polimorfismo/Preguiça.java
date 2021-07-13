package br.com.generation.exercicioPolimorfismo;

public class Preguiça implements Animal {

	@Override
	public void nome() {
		System.out.println("Carlos");
		
	}

	@Override
	public void idade() {
		System.out.println("12");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Som não catalogado");
		
	}

}
