package br.com.alexgomes.sistemaautomitivo;

public class CarroMain {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.ano = 1965;
		fusca.cor = "Azul";
		fusca.marca = "VW";
		fusca.modelo = "Fusca Itamar";
		fusca.motor = 1.5;
		fusca.renavam = "1234567890";
		
		Carro monza = new Carro();
		monza.ano = 1987;
		monza.cor = "Preto";
		monza.marca = "GM";
		monza.modelo = "Monza Classic";
		monza.motor = 2.0;
		monza.renavam = "0987654321";
		
		Carro corcel = new Carro("Ford", 1.4, "Corcel II", "Branco", 1986, "12341234");
		
		System.out.println(fusca);
		System.out.println("");
		System.out.println(monza);
		System.out.println("");
		System.out.println(corcel);
		
	}	
}
