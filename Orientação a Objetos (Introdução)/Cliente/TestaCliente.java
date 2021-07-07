package br.com.generation.exerciciospoo;


public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Jonatas Palumbo Ribeiro");
		cliente1.setCodigo("0001");
		cliente1.setCpf("123.456.789-10");
		cliente1.setDataDeNascimento("07/07/2003");
		cliente1.setEmail("jonatas1234@email.com");
		cliente1.setSexo("M");
		cliente1.setTelefone("(11) 99999-4528");
		cliente1.setLogradouro("Rua Amsterdã, 789");
		cliente1.setCep("0100-000");		
		
		System.out.println("=======DADOS CADASTRAIS DO CLIENTE=======\n");
		System.out.println("Cliente: " + cliente1.getNome());
		System.out.println("Código: " + cliente1.getCodigo());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("Data de Nascimento: " + cliente1.getDataDeNascimento());
		System.out.println("Sexo: " + cliente1.getSexo());
		System.out.println("Telefone Celular: " + cliente1.getTelefone());
		System.out.println("E-mail: " + cliente1.getEmail());
		System.out.println("Logradouro: " + cliente1.getLogradouro());
		System.out.println("CEP: " + cliente1.getCep());
		System.out.println("\n=========================================");		
		
	}

}
