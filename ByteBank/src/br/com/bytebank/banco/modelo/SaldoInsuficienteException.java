package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		return "Exce��o quando o saldo for insuficiente. "+super.getMessage();
	}
}
