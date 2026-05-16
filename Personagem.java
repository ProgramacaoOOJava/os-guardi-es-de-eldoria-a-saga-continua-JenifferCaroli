
public class Personagem {
    // A classe Personagem é uma classe abstrata que define os atributos e métodos
    // comuns a todos os personagens do jogo.

    private String nome, classe;
    private int nivel, pontosDeVida;
    private double poderBase;
    // Construtor, getters e setters para os atributos da classe.

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }
    // Getters para acessar os atributos privados da classe.

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }
    // Setters para modificar os atributos privados da classe com validações.

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. O nome não pode ser vazio.");
        }
    }

    // O método setClasse agora inclui uma validação para garantir que a classe não
    // seja vazia.
    public void setClasse(String classe) {
        if (classe != null && !classe.trim().isEmpty()) {
            this.classe = classe;
        } else {
            System.out.println("Classe inválida. A classe não pode ser vazia.");
        }
    }

    // O método setNivel agora inclui uma validação para garantir que o nível seja
    // maior que zero.
    public void setNivel(int nivel) {
        if (nivel > 0) {
            this.nivel = nivel;
        } else {
            System.out.println("Nível inválido. O nível deve ser maior que zero.");
        }
    }

    // O método setPontosDeVida agora inclui uma validação para garantir que os
    // pontos de vida sejam maiores que zero.
    public void setPontosDeVida(int pontosDeVida) {
        if (pontosDeVida > 0) {
            this.pontosDeVida = pontosDeVida;
        } else {
            System.out.println("Pontos de Vida inválidos. Os pontos de vida devem ser maior que zero.");
        }
    }

    // O método setPoderBase agora inclui uma validação para garantir que o poder
    // base seja
    public void setPoderBase(double poderBase) {
        if (poderBase > 0) {
            this.poderBase = poderBase;
        } else {
            System.out.println("Poder Base inválido. O poder base deve ser maior que zero.");
        }
    }

    // Método para usar a habilidade do personagem, que será implementado nas
    // subclasses específicas (Mago e Guerreiro).
    public void usarHabilidade() {
    }

    @Override
    public String toString() {
        return "Personagem{"
                + "nome='" + nome + '\''
                + ", classe='" + classe + '\''
                + ", nivel=" + nivel
                + ", pontosDeVida=" + pontosDeVida
                + ", poderBase=" + poderBase
                + '}';
    }

    @Override
    // Método para comparar dois objetos Personagem com base em nome e classe
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Personagem that = (Personagem) obj;
        return nome.equals(that.nome) && classe.equals(that.classe);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + nome.hashCode();
        result = 31 * result + classe.hashCode();
        return result;
    }

    // Método para exibir as informações do personagem.
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Classe: " + this.getClasse());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("Pontos de Vida: " + this.getPontosDeVida());
        System.out.println("Poder Base: " + this.getPoderBase());
    }

    // Método protegido que aumenta o poder base
    protected void atribuirBencao(double valor) {
        this.poderBase += valor;
    }
}
