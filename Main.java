//importando a classe ArrayList para criar uma lista de personagens.

import java.util.ArrayList;

public class Main {
    // Criando uma lista (ArrayList) de personagem.
    // Adicionando um Mago e um Guerreiro à lista.

    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(new Mago("Lia", "Mago", 50, 100, 200.0));
        personagens.add(new Guerreiro("Thorin", "Guerreiro", 45, 150, 250.0));
        personagens.add(new Mago("Merlin", "Mago", 60, 120, 300.0));
        personagens.add(new Guerreiro("Aragorn", "Guerreiro", 55, 130, 350.0));

        // percorrer a lista com um for e para cada personagem: chamar o métdo
        // exibirStatus, usarHabilidade
        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            System.out.println(" ");
            personagem.usarHabilidade();
            System.out.println(" ");
            // Se for um Mago registrar ao menos uma ação usando registrarAcao.
            if (personagem instanceof Mago) {
                ((Mago) personagem).registrarAcao("Usou uma bola de fogo!");
                ((Mago) personagem).auditarAcoes();
            }
            // Fazer cast eplícito para Personagem e invocar atribuirBencao com um valor
            // arbitrário,depois chamar exibirStatus mais uma vez.
            if (personagem instanceof Personagem) {
                ((Personagem) personagem).atribuirBencao(100.0);
                ((Personagem) personagem).exibirStatus();

            }

        }
    }
}
