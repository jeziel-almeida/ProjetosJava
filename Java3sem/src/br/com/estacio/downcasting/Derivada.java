package br.com.estacio.downcasting;

public class Derivada extends Base {
	
	protected int var_der;
	
	public Derivada() {
		System.out.println("O valor de var_base antes da instanciação da classe Derivada é "+this.var_base);
		this.var_base = this.var_der = -2;
	}
	
	public void atualizarVarDer(int valor) {
		this.var_der = valor;
	}
	
	public void imprimirVarDer() {
		System.out.println("O valor de var_der é "+this.var_der);
	}
}
