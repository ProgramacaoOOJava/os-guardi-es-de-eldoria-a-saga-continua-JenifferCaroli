
public class Guerreiro extends Personagem {
    // Construtor da classe Guerreiro que chama o construtor da classe Personagem
    // para inicializar os atributos.

    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }
    // Implementação do método abstrato para definir a habilidade específica do
    // Guerreiro.

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " realiza um ataque poderoso com sua espada!");
    }

}
