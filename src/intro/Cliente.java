package intro;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do Cliente: " + nome + ", Endereço: " + endereco);
    }
}
