package intro;

import java.util.Scanner;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		
		List<Produto> prateleira = List.of(
			new Livro("Livro",25.50, "Anonimo", 2025),
			new Ebook("Livro: E", 10.15, "Anonimo2", 2025, 10.77),
			new Audiobook("LivroAudio", 5.99, "Anonimo3", 2025, 120),
			new ItemPapelaria("Papelaria", 4.99, "PapelPlus", "É papel!")
		);
		
		// Entrada do usuário
		// Diferente de Python, é necessário instanciar um objeto chamado Scanner
		//Scanner input = new Scanner(System.in);
		
		//System.out.println("Testando");
		//System.out.println("Digite algo: ");

		// Variável que vai receber a entrada do usuário
		//String inputText = input.nextLine();

		// Printa o que o usuário escreveu
		System.out.println("Bem-vindo a livraria digital!");
		System.out.println("----------------");
		System.out.println("Produto:\n");

		for (Produto p : prateleira) {
			p.exibirDetalhes();
			System.out.println("---");
		};
		
		// Fecha o scanner para não vazar memória
		//input.close();
	}
}
