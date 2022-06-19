package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>(); 
		alunos.add("Rodrigo");
		alunos.add("Lucas");
		alunos.add("Amanda");
		alunos.add("Rodrigo");
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			if(aluno.compareTo("Amanda") == 0) {
				System.out.println("Tem amanda no set");
			}
		});
		
		System.out.println(alunos.contains("Lucas"));
	}

}
