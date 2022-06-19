package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * A classe Conta e suas subclasses representam o funcionamento 
 * e características de uma conta em um banco digital.
 * 
 * @author Jeziel Barros de Almeida
 * @version 0.1
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas = 0;
	
	/**
	 * Construtor para inicializar as contas com a agência e o numero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.totalDeContas++;
	}
	
	
	public abstract void depositar(double valor);
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Erro: Saldo insuficiente: R$ "+this.saldo);
		}
		this.saldo -= valor;
	}
	
	public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
		this.sacar(valor);
		destino.depositar(valor);
	}
		
	//GETTERS AND SETTERS
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia || this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {

		return Double.compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		return "Número: "+this.numero+", Saldo: "+this.saldo;
	}
}
