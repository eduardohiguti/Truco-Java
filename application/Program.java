package application;

import entities.*;

public class Program {
    public static void main(String[] args) {
    Baralho baralho = new Baralho();

    System.out.println("Imprimindo todas as cartas disponiveis");
    baralho.terminal();
    System.out.println("====================================");
    System.out.println("Embaralhando cartas");
    baralho.embaralhar();
    System.out.println("====================================");
    System.out.println("Cartas embaralhadas");
    baralho.terminal();
    }
}
