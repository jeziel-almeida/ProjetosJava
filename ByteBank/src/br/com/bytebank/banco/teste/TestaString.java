package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TestaString {

	public static void main(String[] args) {
		
		String str = "inconstitucional";
		
		StringBuilder b = new StringBuilder("Jeziel");
		b.append(" Barros");
		
		str = b.toString();
		//System.out.println(str);
		
		
		String nova = str.substring(6);
		
		int pos = str.indexOf("ra");
		
		char c = str.charAt(1);
		
//		for(int i=0; i<str.length(); i++) {
//			System.out.print(str.charAt(i)+"+");
//		}
		
		Object cc = new ContaCorrente(1,22);
		Object cp = new ContaPoupanca(2,19);
		
		System.out.println(cc);
		System.out.println(cp);
		
	}

}
