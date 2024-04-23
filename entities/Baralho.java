package entities;

import java.util.ArrayList;
import java.util.List;

import entities.Carta.Naipe;
import entities.Carta.Valor;

import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> baralho;
    private Carta manilha;

    public Baralho() {
        baralho = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                baralho.add(new Carta(valor, naipe));
            }
        }
        embaralhar();
        definirManilha();
        embaralhar();
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    private void definirManilha() {
        manilha = baralho.get(1);
    }

    public void distribuir(List<Carta> maoJogador1, List<Carta> maoJogador2, List<Carta> maoJogador3, List<Carta> maoJogador4) {
        final int tamanhoMao = 3;
        final int quarto = baralho.size() / 4;

        for (int i=0; i<tamanhoMao; i++) {
            maoJogador1.add(baralho.get(i));
            maoJogador2.add(baralho.get(i + quarto));
            maoJogador3.add(baralho.get(i + quarto * 2));
            maoJogador4.add(baralho.get(i + quarto * 3));
        }
    }

    public ArrayList<Carta> getBaralho() {
        return baralho;
    }

    public Carta getManilha() {
        return manilha;
    }
}