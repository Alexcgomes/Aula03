package br.com.alexgomes.sistemaautomitivo;

public class Carro {
	
	String marca;
	double motor;
	String modelo;
	String cor;
	int ano;
	String renavam;
	
	public Carro(){
		
	}
	
	public Carro(String marca, double motor, String modelo, String cor, int ano, String renavam){
		
		this.marca = "";
		this.motor = 0;
		this.modelo = "";
		this.cor = "";
		this.ano = 0;
		this.renavam = "";
		
	}

	@Override
	public String toString(){
		return "Modelo: "+modelo+"\n"+"Marca: "+marca+"\n"+"Cor: "+cor;
	}
	
}
