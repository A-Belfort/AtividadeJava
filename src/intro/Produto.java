package intro;

// Classe de produto, outras vão herdar dela 
public class Produto {
    // Todo produto tem um nome e preço
    private final String nome;
    private final Float preco;

    // Inicializa um objeto de produto
    public Produto(String nome, Float preco) { 
        this.nome = nome;
        this.preco = preco;
    };

    // Retorna do nome do produto
    public String getNome() {
        return nome;
    }

    // Retorna o preço do produto
    public float getPreco() {
        return preco;
    }

}
