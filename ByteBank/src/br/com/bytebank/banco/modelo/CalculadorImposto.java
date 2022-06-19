package br.com.bytebank.banco.modelo;

public class CalculadorImposto {
	private double soma;
	
	public void registra(Tributavel tribu) {
		double valor = tribu.getValorImposto();
		this.soma += valor;
	}
	
	public double getSoma() {
		return soma;
	}
}
