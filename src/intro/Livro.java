package intro;

public class Livro extends Produto {
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, Double preco, String autor, int anoPublicacao) {
        super(nome, preco); // Chama o construtor da superclasse Produto
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Reutiliza o método da superclasse
        System.out.println("Autor: " + autor + ", Ano: " + anoPublicacao);
    }
}

