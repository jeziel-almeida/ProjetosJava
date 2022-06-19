package br.com.bytebank.banco.modelo;

public class GuardadorDeObjetos {
	
	private Object[] referencias;
	private int posLivre;
	
	public GuardadorDeObjetos() {
		this.referencias = new Object[10];
		this.posLivre = 0;
	}
	
	public void push(Object item) {
		this.referencias[this.posLivre] = item;
		this.posLivre++;
	}

	public int totalDeItens() {
		return this.posLivre;
	}

	public Object pullItem(int i) {
		return this.referencias[i];
	}
}
