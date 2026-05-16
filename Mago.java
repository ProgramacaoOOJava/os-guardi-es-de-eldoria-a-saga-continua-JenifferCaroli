
import java.util.ArrayList;

public class Mago extends Personagem implements Auditavel {
    // Construtor da classe Mago que chama o construtor da classe Personagem para
    // inicializar os atributos.

    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }
    // Implementação do método abstrato para definir a habilidade específica do
    // Mago.

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " lança uma bola de fogo!");
    }

    // implementar uma ArrayList de String para registrar as ações e imprimi-las no
    // método auditarAcoes().
    private ArrayList<String> acoes = new ArrayList<>();

    @Override
    public void registrarAcao(String acao) {
        acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.print("Ações registradas ");
        for (String acao : acoes) {
            System.out.println(acao);
        }
    }

}
