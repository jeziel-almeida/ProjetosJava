package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente jeziel = new Cliente();
		jeziel.setCpf("12345");
		jeziel.setNome("Jeziel");
		jeziel.setProfissao("Dev");
		
		ContaCorrente cc = new ContaCorrente(33, 22);
		cc.setTitular(jeziel);
		cc.depositar(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
