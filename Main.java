//importando a classe ArrayList para criar uma lista de personagens.

import java.util.ArrayList;

public class Main {
    //Criando uma lista (ArrayList) de personagem.
    //Adicionando um Mago e um Guerreiro à lista.

    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(new Mago("Lia", "Mago", 50, 100, 200.0));
        personagens.add(new Guerreiro("Thorin", "Guerreiro", 45, 150, 250.0));
        personagens.add(new Mago("Merlin", "Mago", 60, 120, 300.0));
        personagens.add(new Guerreiro("Aragorn", "Guerreiro", 55, 130, 350.0));
//Percorrendo a lista de personagens e exibindo suas informações e habilidades.
        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            personagem.usarHabilidade();
            System.out.println();
        }

    }
}
