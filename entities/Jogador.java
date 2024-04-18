package entities;

import java.util.ArrayList;

public class Jogador {
    private int pontuacao;
    private ArrayList<Carta> mao;

    public Jogador(ArrayList<Carta> mao) {
        this.mao = mao;
        this.pontuacao = 0;
    }

    public void receberCarta(Carta carta) {
        mao.add(carta);
    }

    public Carta jogaCarta(int n) {
        return this.mao.remove(n);
    }


    //Getters e Setters
    public ArrayList<Carta> getMao() {
        return this.mao;
    }

    public void setMao(ArrayList<Carta> mao) {
        this.mao = mao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
