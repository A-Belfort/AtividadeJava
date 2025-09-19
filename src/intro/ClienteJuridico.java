package intro;

public class ClienteJuridico extends Cliente {
    private String cnpj;
    private String nomeFantasia;

    public ClienteJuridico(String nome, String endereco, String cnpj, String nomeFantasia) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Pessoa Jurídica, CNPJ: " + cnpj + ", Nome Fantasia: " + nomeFantasia);
    }
}