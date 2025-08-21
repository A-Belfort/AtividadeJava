package intro;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// Entrada do usuário
		// Diferente de Python, é necessário instanciar um objeto chamado Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Testando");
		System.out.println("Digite algo: ");

		// Variável que vai receber a entrada do usuário
		String inputText = input.nextLine();

		// Printa o que o usuário escreveu
		System.out.println("Vc disse: " + inputText);
		
		// Fecha o scanner para não vazar memória
		input.close();
	}
}
