package exercicio2lista2;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
	
		
		pessoa1.nome = "Joao";
		pessoa2.nome = "Maria";
		pessoa1.sexo = "M";
		pessoa2.sexo = "F";
		pessoa1.cpf = "2222";
		pessoa2.cpf = "3333";
		pessoa1.idade = 25;
		pessoa2.idade = 20;
		pessoa1.altura = 1.70;
		pessoa2.altura = 1.60;
		pessoa1.peso = 75.0;
		pessoa2.peso = 55.0;
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		
		pessoa1.andar();
		pessoa2.andar();
		
		pessoa1.correr();
		pessoa2.correr();
		
		pessoa1.dormir();
		pessoa2.dormir();
		
		pessoa1.falar();
		pessoa2.falar();
	}
}
