package intro;

public class LivroFisico extends Livro {
    private int numeroPaginas;

    public LivroFisico(String nome, Double preco, String autor, int anoPublicacao, int numeroPaginas) {
        super(nome, preco, autor, anoPublicacao); // Chama o construtor da superclasse Livro
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Físico, Páginas: " + numeroPaginas);
    }
}
