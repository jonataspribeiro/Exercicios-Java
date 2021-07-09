package br.com.generation.exerciciosherancapolimorfismo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnimalMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		System.out.print("Qual � o nome do Cachorro: " );
		cachorro1.setPossuiNome(entrada.nextLine());
		JOptionPane.showMessageDialog(null, cachorro1.getPossuiNome());
		
		System.out.println("Nome: " + cachorro1.getPossuiNome());
		cachorro1.setDeveEmitirSom("Latido");  //--> Set - Ele modifica o atributo.
		cavalo1.setDeveEmitirSom("Relincho");
		preguica1.setDeveEmitirSom("Som n�o catalogado");				
			
		System.out.println("----Qual � o som dos animais?----");  
		System.out.println("Cachorro: " + cachorro1.getDeveEmitirSom());//--> Get - Recuperar o dado.
		System.out.println("Cavalo: " + cavalo1.getDeveEmitirSom());
		System.out.println("Pregui�a: " + preguica1.getDeveEmitirSom());

	}

}
