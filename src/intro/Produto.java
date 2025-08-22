package intro;

// Classe de produto, outras vão herdar dela 
public class Produto {
    // Todo produto tem um nome e preço
    private final String nome;
    private Double preco;

    // Inicializa um objeto de produto
    public Produto(String nome, Double preco) { 
        this.nome = nome;
        this.preco = preco;
    };

    // Retorna do nome do produto
    public String getNome() {
        return nome;
    }

    // Retorna o preço do produto
    public Double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Preço: R$" + preco);
    }
}