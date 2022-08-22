package pessoa;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa vitor = new Pessoa();
		
		vitor.idade = 26;
		vitor.nome = "Vitor";
		
		vitor.imprimirIdade();
		vitor.imprimirNome();
	}
}
