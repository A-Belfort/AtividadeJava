package intro;

public class Caneta extends ItemPapelaria {
	private String cor;
	double espessuraponta;
	private String tintatipo;
	
	public Caneta(String nome, Double preco, String marca, String tintatipo, double espessuraponta, String cor) {
		super(nome, preco, marca);
        this.espessuraponta = espessuraponta;
        this.cor = cor;
        this.tintatipo = tintatipo;
	}

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Reutiliza o método da superclasse
        System.out.println("Tipo de tinta: " + tintatipo + ", Espessura da ponta: " + espessuraponta + ", Cor: " + cor);
    }
}
