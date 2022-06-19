package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeObjetos;

public class TesteArray {

	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		Conta cc = new ContaCorrente(22,11);
		Conta cp = new ContaPoupanca(33,44);
		Cliente cliente = new Cliente();
		
		guardador.push(cc);
		guardador.push(cp);
		guardador.push(cliente);
		guardador.push(10);

		System.out.println(guardador.totalDeItens());
		
		Conta ref = (Conta) guardador.pullItem(0);
		int num = (int) guardador.pullItem(3);
		
		System.out.println(ref.getNumero());
		System.out.println(num);
	}

}
