package intro;

import java.util.Scanner;
import java.util.List;

public class App {
	public static void main(String[] args) {
		ClienteFisico cliente = new ClienteFisico("Fulano","Rua Tal de Tal, 50","999.999.999-99");
		
		List<Produto> prateleira = List.of(
			new LivroFisico("Livro",25.50, "Anonimo", 2025, 240),
			new Ebook("Livro: Edição Digital", 10.50, "Anonimo", 2025, 10.77),
			new Audiobook("Livro: Edição Audiobook", 8.99, "Anonimo", 2025, 120),
			new Revista("Turma da Cônica",4.99,"Editora Outubro",23),
			new Lapis("FabroCastello", 2.99, "FabroCastello","Madeira",0.7,"Preto"),
			new Caneta("FabroCastelloPremiumInk", 24.99, "FabroCastello","Nanquim",0.5,"Preto")
		);

		System.out.println("Bem-vindo a livraria digital, " + cliente.getNome() + "!");
		System.out.println("Seu endereço atual: " + cliente.getEndereco());
		System.out.println("----------------");
		System.out.println("Produto:\n");

		for (Produto p : prateleira) {
			p.exibirDetalhes();
			System.out.println("---");
		};
	}
}
