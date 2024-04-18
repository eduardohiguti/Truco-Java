package entities;

import java.util.List;

public class Jogo {
    private List<Carta> mao1;
    private List<Carta> mao2;

    public Jogo(List<Carta> mao1, List<Carta> mao2) {
        this.mao1 = mao1;
        this.mao2 = mao2;
    }

    public void jogar() {
        int pontosMao1 = 0;
        int pontosMao2 = 0;

        for (int i = 0; i < mao1.size(); i++) {
            Carta cartaMao1 = mao1.get(i);
            Carta cartaMao2 = mao2.get(i);

            int resultado = compararCartas(cartaMao1, cartaMao2);

            if (resultado > 0) {
                pontosMao1++;
                System.out.println("Jogador 1 venceu esta rodada com " + cartaMao1);
            } else if (resultado < 0) {
                pontosMao2++;
                System.out.println("Jogador 2 venceu esta rodada com " + cartaMao2);
            } else {
                System.out.println("Empate nesta rodada com " + cartaMao1 + " e " + cartaMao2);
            }
        }

        if (pontosMao1 > pontosMao2) {
            System.out.println("Jogador 1 venceu o jogo com " + pontosMao1 + " pontos!");
        } else if (pontosMao1 < pontosMao2) {
            System.out.println("Jogador 2 venceu o jogo com " + pontosMao2 + " pontos!");
        } else {
            System.out.println("O jogo terminou em empate!");
        }
    }

    private int compararCartas(Carta carta1, Carta carta2) {
        int rankCarta1 = carta1.getNaipe().getRank() * Valor.values().length + carta1.getValor().getRank();
        int rankCarta2 = carta2.getNaipe().getRank() * Valor.values().length + carta2.getValor().getRank();

        return Integer.compare(rankCarta1, rankCarta2);
    }
}
