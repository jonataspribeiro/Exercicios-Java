package br.com.generation.exercicioPolimorfismo;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal cavalo1 = new Cavalo();
		Animal cachorro1 = new Cachorro();
		Animal preguica1 = new Pregui�a();
		
		System.out.println("=============Cavalo=============\n");
		
		cavalo1.nome();
		cavalo1.idade();
		cavalo1.emiteSom();
		System.out.println("\n================================");
		
		System.out.println("\n============Cachorro============\n");
		
		cachorro1.nome();
		cachorro1.idade();
		cachorro1.emiteSom();
		System.out.println("\n================================");
		
		System.out.println("\n============Pregui�a============\n");
		
		preguica1.nome();
		preguica1.idade();
		preguica1.emiteSom();
		System.out.println("\n================================");
	}

}
