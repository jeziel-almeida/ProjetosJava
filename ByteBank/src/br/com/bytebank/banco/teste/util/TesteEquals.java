package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteEquals {

	public static void main(String[] args) {
		
		List<String> argumentos = Arrays.asList(args);
		
		List<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22,11);
		Conta cp = new ContaPoupanca(33,44);
		Conta cp2 = new ContaPoupanca(33,44);
		
		lista.add(cc);
		lista.add(cp);
		
		System.out.println("Tamanho da lista: "+lista.size());
		
		System.out.println("cp2 está na lista? "+lista.contains(cp2));
		
		for(Conta conta : lista) {
			if(conta.equals(cp2)) {
				System.out.println("Tenho essa conta na lista!");
			}
		}
		
		for(Conta conta : lista) {
			System.out.print(conta+" * ");
		}
		//-----------------
		System.out.println();
		
		Number numero = Integer.valueOf(523);
		System.out.println(numero.doubleValue());
		
		List<Number> nums = new ArrayList<>();
		nums.add(22);
		nums.add(2.34);
		
		for(Number n : nums) {
			System.out.println(n);
		}
		
	}

}
