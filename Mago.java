
public class Mago extends Personagem {
//Construtor da classe Mago que chama o construtor da classe Personagem para inicializar os atributos.

    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }
//Implementação do método abstrato para definir a habilidade específica do Mago.

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " lança uma bola de fogo!");
    }
}
