package entities;

public class Carta {
    private Naipe naipe;
    private Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
enum Naipe {
    OUROS    (0), 
    ESPADAS  (1), 
    COPAS    (2), 
    PAUS     (3);

    private int rank;

    Naipe (int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }
}

enum Valor {
    QUATRO  (0), 
    CINCO   (1), 
    SEIS    (2), 
    SETE    (3), 
    DAMA    (4), 
    VALETE  (5), 
    REI     (6), 
    AS      (7), 
    DOIS    (8), 
    TRES    (9); 

    private int rank;

    Valor (int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }
}