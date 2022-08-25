package exercicio2lista2;

public class Pessoa {
	String nome;
	String sexo;
	String cpf;
	int idade;
	Double altura;
	Double peso;
	
	
	public void andar() {
		System.out.println(nome + " estah correndo");
	}
	
	public void correr() {
		System.out.println(nome + " estah andando");
	}
	
	public void falar() {
		System.out.println(nome + " estah falando");
	}
	
	public void dormir() {
		System.out.println(nome + " estah dormindo");
	}
	
	public String toString() {
		return "Nome: " + nome+
				"\tSexo: "+sexo+
				"\tCPF: "+cpf+
				"\tidade: "+idade+
				"\taltura: "+altura+
				"\tpeso: "+peso;
	}
}
