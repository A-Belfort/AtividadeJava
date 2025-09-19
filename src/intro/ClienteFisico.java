package intro;

public class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Pessoa Física, CPF: " + cpf);
    }
}