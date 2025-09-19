package intro;

public class Revista extends Produto {
    private String editora;
    private int numeroEdicao;

    public Revista(String nome, double preco, String editora, int numeroEdicao) {
        super(nome, preco);
        this.editora = editora;
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Revista, Editora: " + editora + ", Edição: " + numeroEdicao);
    }
}

