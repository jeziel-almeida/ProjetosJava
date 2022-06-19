package br.com.estacio.modelo;

public class Fisica extends Pessoa {

	public Fisica(String nome, int id) {
		super(nome, id);
	}

	@Override
	public boolean atualizarID(int identificador) {
		super.identificador = identificador;
		return true;
	}
	
	
		
}