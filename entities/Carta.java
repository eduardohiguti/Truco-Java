package entities;

public class Carta {
    public enum Valor {
        QUATRO   (0),
        CINCO    (1),
        SEIS     (2),
        SETE     (3),
        DAMA     (4),
        VALETE   (5),
        REI      (6),
        AS       (7),
        DOIS     (8),
        TRES     (9);
    
        private int rank;
    
        Valor(int rank) {
            this.rank = rank;
        }
        public int getRank() {
            return this.rank;
        }
    }
    
    public enum Naipe {
        OURO     (0),
        ESPADAS  (1),
        COPAS    (2),
        PAUS     (3);
    
        private int rank;
    
        Naipe(int rank) {
            this.rank = rank;
        }
        public int getRank() {
            return this.rank;
        }
    }

    private final Valor valor;
    private final Naipe naipe;

    public Carta(Valor valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Valor valor() {
        return valor;
    }

    public Naipe naipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String toString() {
        return valor + " de " + naipe;
    }

}