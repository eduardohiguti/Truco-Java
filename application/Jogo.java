package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.*;
import entities.Carta.Valor;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baralho baralho = new Baralho();
        ArrayList<Carta> maoJogador1 = new ArrayList<>();
        ArrayList<Carta> maoJogador2 = new ArrayList<>();

        System.out.println();
        System.out.print("Bem vindo ao truco em java\n");
        System.out.println("A manilha é: " + baralho.getManilha() + "\n");
        
        baralho.distribuir(maoJogador1, maoJogador2);

        Jogador jogador1 = new Jogador(0, maoJogador1);
        Jogador jogador2 = new Jogador(0, maoJogador2);

        for (int i=0; i<3; i++) {
            imprimirMao(jogador1, jogador2, baralho.getManilha());
            System.out.println("Jogador 1, escolha sua carta!");
            int escolhaJogador1 = sc.nextInt();
            sc.nextLine();
            Carta cartaEscolhidaJogador1 = jogador1.getMao().get(escolhaJogador1 - 1);
            System.out.println("Jogador 2, escolha sua carta!");
            int escolhaJogador2 = sc.nextInt();
            Carta cartaEscolhidaJogador2 = jogador2.getMao().get(escolhaJogador2 - 1);
            sc.nextLine();

            int resultado = compararCartas(cartaEscolhidaJogador1, cartaEscolhidaJogador2, baralho.getManilha());

            if (resultado > 0) {
                jogador1.incrementarPontuacao();
                System.out.println("Jogador 1 venceu esta rodada com " + cartaEscolhidaJogador1);
            } else if (resultado < 0) {
                jogador2.incrementarPontuacao();
                System.out.println("Jogador 2 venceu esta rodada com " + cartaEscolhidaJogador2);
            } else {
                System.out.println("Empate nesta rodada com " + cartaEscolhidaJogador1 + " e " + cartaEscolhidaJogador2);
            }
            jogador1.removerCarta(escolhaJogador1 - 1);
            jogador2.removerCarta(escolhaJogador2 - 1);
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Pontuação final:");
        System.out.println("Jogador 1: " + jogador1.getPontuacao() + " pontos!");
        System.out.println("Jogador 2: " + jogador2.getPontuacao() + " pontos!");

        if (jogador1.getPontuacao() > jogador2.getPontuacao()) {
            System.out.println("Jogador 1 venceu o jogo com " + jogador1.getPontuacao() + " pontos!");
        } else if (jogador1.getPontuacao() < jogador2.getPontuacao()) {
            System.out.println("Jogador 2 venceu o jogo com " + jogador2.getPontuacao() + " pontos!");
        } else {
            System.out.println("O jogo terminou em empate!");
        }
        sc.close();
    }

    private static int compararCartas(Carta carta1, Carta carta2, Carta manilha) {
        int rankCarta1 = getRankCarta(carta1, manilha);
        int rankCarta2 = getRankCarta(carta2, manilha);

        return Integer.compare(rankCarta1, rankCarta2);
    }

    private static int getRankCarta(Carta carta, Carta manilha) {
        if (carta.equals(manilha)) {
            return Integer.MAX_VALUE;
        } else {
            int rankCarta = carta.getNaipe().getRank() * Valor.values().length + carta.getValor().getRank();
            return rankCarta;
        }
    }

    private static void imprimirMao(Jogador jogador1, Jogador jogador2, Carta manilha) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Manilha: " + manilha + "\n");
        System.out.println("Mão do Jogador 1:");

        for (int i=0; i<jogador1.getMao().size(); i++) {
            Carta carta = jogador1.getMao().get(i);
            System.out.println("(" + (i + 1) + ") " + carta + ", poder da carta: " + carta.getNaipe().getRank() + carta.getValor().getRank());
        }
        System.out.println();
        System.out.println("Mão do Jogador 2:");
        for (int i=0; i<jogador2.getMao().size(); i++) {
            Carta carta = jogador2.getMao().get(i);
            System.out.println("(" + (i + 1) + ") " + carta + ", poder da carta: " + carta.getNaipe().getRank() + carta.getValor().getRank());
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
    }
}