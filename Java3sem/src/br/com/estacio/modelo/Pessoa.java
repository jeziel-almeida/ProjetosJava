package br.com.estacio.modelo;

public abstract class Pessoa {
	protected int identificador;
	private String nome;
	
	public Pessoa(String nome, int id) {
		this.nome = nome;
		this.identificador = id;
	}
	
	public abstract boolean atualizarID(int identificador);
	
	public final int recuperaID() {
		return this.identificador;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + this.nome + "\n\t- Identificador: " + this.identificador;
	}
	
	@Override
	public boolean equals(Object obj) {
		if((nome.equals(((Pessoa)obj).nome)) && (this instanceof Pessoa))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		if(this instanceof Pessoa)
			return this.nome.hashCode();
		else
			return super.hashCode();
	}
}
