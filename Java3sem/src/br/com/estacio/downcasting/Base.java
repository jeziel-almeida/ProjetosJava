package br.com.estacio.downcasting;

public class Base {
	
	protected int var_base;
	
	public Base() {
		var_base = -1;
	}
	
	protected void atualizarVarBase(int valor) {
		this.var_base = valor;
	}
	
	protected void imprimirVarBase() {
		System.out.println("O valor de var_base é "+this.var_base);
	}
	
	//Atualiza o valor de var_der com DOWNCASTING:
	protected void atualizarVarSub(int valor) {
		((Derivada)this).var_der = valor;
	}
	
	//Imprime o valor de var_der com DOWNCASTING:
	protected void imprimirVarSub() {
		System.out.println("O valor de var_der na subclasse é "+ ((Derivada)this).var_der);
	}
	
	
}