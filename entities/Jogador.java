package entities;

import java.util.List;

public class Jogador {
    private int pontuacao;
    private List<Carta> mao;

    public Jogador(List<Carta> mao) {
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
    public List<Carta> getMao() {
        return this.mao;
    }

    public void setMao(List<Carta> mao) {
        this.mao = mao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
