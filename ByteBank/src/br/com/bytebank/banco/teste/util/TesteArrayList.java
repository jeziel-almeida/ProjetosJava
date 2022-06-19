package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22,11);
		Conta cp = new ContaPoupanca(33,44);
		
		lista.add(cc);
		lista.add(cp);
		
		System.out.println("Tamanho: "+lista.size());
		
		Conta ref = lista.get(0);
		
		//lista.remove(cc);
		
		for(int i=0; i<lista.size(); i++) {
			Conta o = lista.get(i);
			System.out.println(o);
		}
		
		for(Conta o : lista) {
			System.out.println(o);
		}
		
	}

}
