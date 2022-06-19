package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Coleções do Java", "Paulo");
		
		javaColecoes.adiciona(new Aula("Kotlin", 30));
		javaColecoes.adiciona(new Aula("Azure", 10));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		//System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		//System.out.println(aulas);
		
		System.out.println(javaColecoes);

	}

}
