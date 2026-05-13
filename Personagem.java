
      
public abstract class Personagem {
//A classe Personagem é uma classe abstrata que define os atributos e métodos comuns a todos os personagens do jogo.

        private String nome, classe;
        private int nivel, pontosDeVida;
        private double poderBase;
//Construtor, getters e setters para os atributos da classe.

        public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
            this.nome = nome;
            this.classe = classe;
            this.nivel = nivel;
            this.pontosDeVida = pontosDeVida;
            this.poderBase = poderBase;
        }
        //Getters para acessar os atributos privados da classe.

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
    

//Método abstrato que deve ser implementado por todas as subclasses para definir a habilidade específica de cada personagem.
    public abstract void usarHabilidade();
//Método para exibir as informações do personagem.
        
    public void exibirStatus() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Classe: " + this.getClasse());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("Pontos de Vida: " + this.getPontosDeVida());
        System.out.println("Poder Base: " + this.getPoderBase());
    }
}
