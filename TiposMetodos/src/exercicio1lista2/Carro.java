package exercicio1lista2;

public class Carro {	
	String marca;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade = 50;
	boolean ligado = false; 
	
	public void ligar() {
		System.out.println(modelo + " ligou");
		ligado = true;
	}
	
	public void desligar() {
		System.out.println(modelo + " desligou");
		ligado = false;
	}
	
	public void acelerar(int valor) {
		if (ligado && velocidade>0){
			System.out.println(modelo + " acelerando");
			velocidade = velocidade + valor;
			System.out.println("Velocidade atual eh de: "+velocidade);
		}else {
			System.out.println(modelo+" desligado");
		}
	}
	
	public void frear(int valor) {
		if (ligado && velocidade>0){
			System.out.println(modelo + " freando");
			velocidade = velocidade - valor;
		}else {
			System.out.println(modelo+" desligado");
		}
		if (velocidade<0) {
			velocidade=0;
		}
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", velocidade=" + velocidade + ", ligado=" + ligado + "]";
	}
}
