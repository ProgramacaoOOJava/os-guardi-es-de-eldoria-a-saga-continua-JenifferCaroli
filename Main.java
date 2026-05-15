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

        // Percorrendo a lista de personagens e exibindo suas informações usando o
        // método toString, além de usar a habilidade de cada personagem e verificar seu
        // tipo usando instanceof.
        for (Personagem personagem : personagens) {
            System.out.println("Status do personagem:");
            System.out.println(" ");
            System.out.println(personagem.toString());
            System.out.println(" ");
            System.out.println("-----------------------------");

            // Usando a habilidade do personagem.
            System.out.println("Usando a habilidade do personagem:");
            System.out.println(" ");
            personagem.usarHabilidade();
            System.out.println(" ");
            System.out.println("-----------------------------");

            // Verificando o tipo do personagem usando instanceof para exibir uma mensagem
            // específica.
            System.out.println("Verificando o tipo do personagem:");
            System.out.println(" ");
            if (personagem instanceof Mago) {
                System.out.println(personagem.getNome() + " é um Mago.");
                System.out.println(" ");
                System.out.println("-----------------------------");
            } else if (personagem instanceof Guerreiro) {
                System.out.println(personagem.getNome() + " é um Guerreiro.");
                System.out.println(" ");
                System.out.println("-----------------------------");
            }

            // Comparar dois personagens com equals e indicar se são iguais ou diferentes.

            System.out.println("Comparando personagens:");
            System.out.println(" ");
            Personagem personagem1 = new Mago("Lia", "Mago", 50, 100, 200.0);
            Personagem personagem2 = new Guerreiro("Thorin", "Guerreiro", 45, 150, 250.0);
            if (personagem1.getClass().equals(personagem2.getClass()) && personagem1.equals(personagem2)) {
                System.out.println(personagem1.getNome() + " e " + personagem2.getNome() + " são iguais.");
            } else if (personagem1.getClass().equals(personagem2.getClass()) && !personagem1.equals(personagem2)) {
                System.out.println(personagem1.getNome() + " e " + personagem2.getNome()
                        + " são do mesmo tipo, mas são diferentes.");
                System.out.println(" ");
            } else {
                System.out.println(personagem1.getNome() + " e " + personagem2.getNome() + " são de tipos diferentes.");
                System.out.println(" ");
            }
        }

    }
}
