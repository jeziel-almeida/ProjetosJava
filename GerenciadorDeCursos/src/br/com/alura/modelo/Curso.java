package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	@Override
	public String toString() {
		return "[Curso: "+this.nome+" com "+this.getTempoTotal()+" de duração. Aulas: "+this.aulas+"]";
	}

	public Aluno buscaMatriculado(int matricula) {
		if(this.matriculaParaAluno.containsKey(matricula)) {
			return this.matriculaParaAluno.get(matricula);			
		}
		throw new NoSuchElementException("Matrícula inexistente: "+matricula);
	}

}
