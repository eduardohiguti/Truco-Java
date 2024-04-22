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
        definirManinha();
        embaralhar();
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    private void definirManinha() {
        manilha = baralho.get(0);
        System.out.println("A manilha é: " + manilha);
    }

    public void distribuir(List<Carta> maoJogador1, List<Carta> maoJogador2) {
        final int tamanhoMao = 3;
        final int meio = baralho.size() / 2;

        for (int i=0; i<tamanhoMao; i++) {
            maoJogador1.add(baralho.get(i));
            maoJogador2.add(baralho.get(i + meio));
        }
    }

    public ArrayList<Carta> getBaralho() {
        return baralho;
    }

    public Carta getManilha() {
        return manilha;
    }
}