package exercicio1lista2;

public class CarroTeste {
	public static void main(String[] args) {
			
		// instancia��o de objetos
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		// atribui��o de valores aos atributos
		carro1.marca = "Ferrari";
		carro1.modelo = "458 Italia";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";
		
		carro2.marca = "Honda";
		carro2.modelo = "Civic";
		carro2.ano = 2021;
		carro2.placa = "MNO-9876";
		carro2.cor = "Azul";
		
		// obten��o dos valores dos objetos
		System.out.println("ATRIBUTOS DO CARRO 1");
		System.out.println(carro1);
		
		System.out.println("\nATRIBUTOS DO CARRO 2");
		System.out.println(carro2);
		
		carro1.ligar();
		carro2.acelerar(20);
		carro2.ligar();
		carro2.acelerar(50);
		carro2.frear(30);
		System.out.println(carro2);
		
		
	}
}
