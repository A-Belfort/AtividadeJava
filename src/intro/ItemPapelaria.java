package intro;

public class ItemPapelaria extends Produto {
    private String marca;

    public ItemPapelaria(String nome, Double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Papelaria, Marca: " + marca);
    }
}
