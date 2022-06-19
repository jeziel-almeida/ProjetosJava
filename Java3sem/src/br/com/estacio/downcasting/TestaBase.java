package br.com.estacio.downcasting;

public class TestaBase {

	public static void main(String[] args) {
		
		Derivada ref = new Derivada();
		ref.imprimirVarBase();
		ref.atualizarVarSub(1000);
		ref.imprimirVarSub();
		ref.imprimirVarDer();
		
		
	}

}
