package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(0, 1);
		System.out.println("100 reais depositado");
		conta.depositar(100);
		
		try {
			System.out.println("Tentando sacar 200 reais...");
			conta.sacar(200);			
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		SaldoInsuficienteException sie = new SaldoInsuficienteException("jeziell");
		System.out.println(sie);
	}

}
