package br.com.estacio.teste;

import br.com.estacio.modelo.IdInvalidoException;

public class TestaExcecaoExplicita {

	public static void main(String[] args) {
		
	
		try {
			throw new IdInvalidoException("CPF inválido");
		} catch (IdInvalidoException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Código após o lançamento da exceção");
		}
		
		
		

	}

}
