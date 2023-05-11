package Klassen;

public class Sitzplatz {
    private int reihe;
    private int sitz;
    private Block block;
    private Zuschauer zuschauer;

    public Sitzplatz(Block block, int reihe, int sitz, Zuschauer zuschauer) {
        this.block = block;
        this.reihe = reihe;
        this.sitz = sitz;
        this.zuschauer = zuschauer;
    }

    public int getReihe() {
        return reihe;
    }

    public int getSitz() {
        return sitz;
    }

    public Block getBlock() {
        return block;
    }

    public Zuschauer getZuschauer() {
        return zuschauer;
    }

    @Override
    public String toString() {
        return "Reihe: "+reihe+"\n"+
                "Sitz: "+sitz+"\n"+
                "Zuschauer: "+zuschauer+"\n"+
                "Block: "+block+"\n";
    }
}
