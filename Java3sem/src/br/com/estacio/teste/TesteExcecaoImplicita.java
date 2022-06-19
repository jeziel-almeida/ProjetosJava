package br.com.estacio.teste;

import java.util.Scanner;

public class TesteExcecaoImplicita {

	public static void main(String[] args) {
		
		int divisor, dividendo, quociente = 0;
		String controle = "s";
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Entre com o dividendo: ");
			dividendo = s.nextInt();
			System.out.println("Entre com o divisor: ");
			divisor = s.nextInt();
			
			try {
				//LAN�ANDO MANUALMENTE UMA EXCE��O IMPL�CITA
				if(divisor == 0) {
					throw new ArithmeticException("Divisor nulo.");
				}
				quociente = dividendo / divisor;
				
			} catch(Exception e) {
				System.out.println("Erro: Divis�o por zero! "+e.getMessage());
			} finally {
				System.out.println("Bloco finally");
			}
			
			System.out.println("O quociente �: "+quociente);
			System.out.println("Repetir? ");
			controle = s.next().toString();
			
		} while (controle.equals("s"));
		
		s.close();

	}

}
