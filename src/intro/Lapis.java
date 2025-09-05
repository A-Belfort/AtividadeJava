package intro;

public class Lapis extends ItemPapelaria{
    private String material;
    private double espessuraponta;
    private String cor;

    public Lapis(String nome, Double preco, String marca, String material, double espessuraponta, String cor) {
        super(nome, preco, marca);
        this.material = material;
        this.espessuraponta = espessuraponta;
        this.cor = cor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Reutiliza o método da superclasse
        System.out.println("Material: " + material + ", Espessura da ponta: " + espessuraponta + ", Cor: " + cor);
    }
}