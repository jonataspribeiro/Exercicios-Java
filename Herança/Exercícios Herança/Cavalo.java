package br.com.generation.exerciciosherancapolimorfismo;

public class Cavalo extends Animal {
	
	private String deveCorrer;
	private String crina;

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public String getCrina() {
		return crina;
	}

	public void setCrina(String crina) {
		this.crina = crina;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}	
}
