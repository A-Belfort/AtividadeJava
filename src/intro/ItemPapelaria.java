package intro;

public class ItemPapelaria extends Produto {
    private String marca;
    private String descricao;

    public ItemPapelaria(String nome, Double preco, String marca, String descricao) {
        super(nome, preco);
        this.marca = marca;
        this.descricao = descricao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Papelaria, Marca: " + marca + ", Descrição: " + descricao);
    }
}
