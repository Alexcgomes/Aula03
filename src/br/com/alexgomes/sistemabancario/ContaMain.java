package br.com.alexgomes.sistemabancario;

public class ContaMain {
	
	public static void main(String[] args) {
		
		Conta contaDoAlex = new Conta("Alex Gomes", 1000);
		Conta contaDoGustavo = new Conta("Gustavo Lopes", 9000);
		
		contaDoAlex.depositar(5000);
		contaDoGustavo.sacar(170);
		
		contaDoAlex.imprimirExtratoResumido();
		contaDoGustavo.imprimirExtratoResumido();
		
	}

}
