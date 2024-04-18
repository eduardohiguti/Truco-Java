package application;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class Program {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        List<Carta> maoJogador1 = new ArrayList<>();
        List<Carta> maoJogador2 = new ArrayList<>();

        baralho.distribuir(maoJogador1, maoJogador2);

        System.out.println("Mão do Jogador 1:");
        for (Carta carta : maoJogador1) {
            System.out.println(carta);
        }

        System.out.println();
        System.out.println("Mão do Jogador 2:");
        for (Carta carta : maoJogador2) {
            System.out.println(carta);
        }
    }
}
