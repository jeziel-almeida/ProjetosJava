package br.com.estacio.teste;

import br.com.estacio.modelo.Aluno;
import br.com.estacio.modelo.Fisica;
import br.com.estacio.modelo.Pessoa;

public class TestaHeranca {

	public static void main(String[] args) {
		
		Pessoa ref[] = new Pessoa[2];
		ref[0] = new Fisica("Marco", 1234);
		ref[1] = new Aluno("Luiz", 4321);
		
		ref[0].atualizarID(1111);
		ref[1].atualizarID(2222);
		
		for(Pessoa p : ref) {
			System.out.println(p.toString());
		}
		
				
	}
}