package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

	public static void main(String[] args) {
		
		//Array de primitivos
		int[] idades = new int[5];
		
		//Array na forma literal
		int[] numeros = {1,2,3,4};
		
//		for(int i=0; i<idades.length; i++) {
//			idades[i] = i * i;
//		}
//		
//		for(int i=0; i<idades.length; i++) {
//			System.out.println(idades[i]);
//		}
		
		//Teste Array de referências
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(1,2);
		
		ContaPoupanca cp1 = new ContaPoupanca(3,4);
		
		contas[0] = cc1;
		contas[1] = cp1;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast
		
		System.out.println(contas[0].getNumero());		
		System.out.println(contas[1].getNumero());
		
		for(int i=0; i<args.length; i++) {
			System.out.print(args[i]+" ");
		}
	}

}
