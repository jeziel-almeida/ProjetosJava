package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo listas";
		String aula2 = "Aplicando ordenação";
		String aula3 = "Implementando arrays";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
