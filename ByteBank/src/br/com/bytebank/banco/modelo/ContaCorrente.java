package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			super.saldo += valor;
		}
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.sacar(valorASacar);
	}

	//Get imposto da interface Tributavel
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente - "+super.toString();
	}
	
}
