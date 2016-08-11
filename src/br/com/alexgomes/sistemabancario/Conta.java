package br.com.alexgomes.sistemabancario;

public class Conta {
	
	private String nome;
	private double saldo;
	public static double limiteCredito = 500;
	
	public Conta(String nome, double saldo){
		
		this.nome = nome;
		this.saldo = saldo;
		
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void imprimirExtratoResumido(){
		System.out.println("==========================");
		System.out.println("BANCO PIRATA");
		System.out.println("==========================");
		
		System.out.println("Nome do Favorecido: "+ nome);
		System.out.println();
		System.out.println();
		System.out.println("Saldo R$ "+ saldo);
		System.out.println("==========================");
		System.out.println("Limite de Credito R$ "+ limiteCredito);
		System.out.println("==========================");
	}
	
	@Override
	public String toString(){
		return "Nome "+this.nome+"\n"+"Saldo "+this.saldo;
	}

}
