package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private ArrayList<Carta> baralho;

    public Baralho() {
        baralho = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                baralho.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    public void distribuir(List<Carta> maoJogador1, List<Carta> maoJogador2) {
        embaralhar();

        final int handSize = 3;
        int meio = baralho.size() / 2;

        for (int i=0; i<handSize; i++) {
            maoJogador1.add(baralho.get(i));
            maoJogador2.add(baralho.get(i + meio));
        }

    }
}
