package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.alura.modelo.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Conhecendo listas", 20);
		Aula a2 = new Aula("Aplicando ordenação", 15);
		Aula a3 = new Aula("Implementando arrays", 10);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}
