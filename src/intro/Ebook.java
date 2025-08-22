package intro;

public class Ebook extends Livro {
    private double tamanhoArquivoMB;

    public Ebook(String nome, Double preco, String autor, int anoPublicacao, double tamanhoArquivoMB) {
        super(nome, preco, autor, anoPublicacao);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Ebook, Tamanho do arquivo: " + tamanhoArquivoMB + " MB");
    }
}