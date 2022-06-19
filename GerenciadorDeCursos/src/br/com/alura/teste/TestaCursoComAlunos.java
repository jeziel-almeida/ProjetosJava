package br.com.alura.teste;

import java.util.NoSuchElementException;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Coleções", "Jeziel");
		
		javaColecoes.adiciona(new Aula("Dominando Listas", 23));
		javaColecoes.adiciona(new Aula("Desvendando os Sets", 22));
		javaColecoes.adiciona(new Aula("Criando filas", 16));
		
		Aluno a1 = new Aluno("Lucas Silva", 1234);
		Aluno a2 = new Aluno("Lucas Silva", 1234);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(new Aluno("Renata do Santos", 4321));
		javaColecoes.matricula(new Aluno("Ricardo Soares", 3212));
		
		try {
			Aluno aluno = javaColecoes.buscaMatriculado(32123);
			System.out.println(aluno);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
