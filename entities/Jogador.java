package entities;

import java.util.List;

public class Jogador {
    private int pontuacao;
    private List<Carta> mao;

    public Jogador(int pontuacao, List<Carta> mao) {
        this.mao = mao;
        this.pontuacao = 0;
    }

    public void incrementarPontuacao() {
        pontuacao = pontuacao + 1;
    }

    public void removerCarta(int escolha) {
        mao.remove(escolha);
    }

    public List<Carta> getMao() {
        return mao;
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