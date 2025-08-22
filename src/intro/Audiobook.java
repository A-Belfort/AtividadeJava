package intro;

public class Audiobook extends Livro {
    private int duracaoMinutos;

    public Audiobook(String nome, Double preco, String autor, int anoPublicacao, int duracaoMinutos) {
        super(nome, preco, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Audiobook, Duração: " + duracaoMinutos + " minutos");
    }
}
