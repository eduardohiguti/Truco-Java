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

    public String toString() {
        return valor + " de "+ naipe;
    }
}

enum Naipe {
    OUROS, COPAS, ESPADAS, PAUS
}

enum Valor {
    AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, VALETE, DAMA, REI
}