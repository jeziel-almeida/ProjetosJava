package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambda {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);
		
		List<Conta> listaDeContas = new ArrayList<>();
		listaDeContas.add(cc1);
		listaDeContas.add(cc2);
		listaDeContas.add(cc3);
		listaDeContas.add(cc4);
		
		listaDeContas.sort( (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );
		
		Comparator<Conta> comp = (Conta o1, Conta o2) -> {
			
				String nome1 = o1.getTitular().getNome();
				String nome2 = o2.getTitular().getNome();
				return nome1.compareTo(nome2);
			
		}; 
		
		listaDeContas.sort(comp);
		
		listaDeContas.forEach((conta) -> System.out.println(conta +" "+ conta.getTitular().getNome()));
		
		System.out.println("-----");
		
		Iterator<Conta> it = listaDeContas.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
