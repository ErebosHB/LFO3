package Klassen;

import java.util.ArrayList;

public class Stadion {
    private String name;
    private Adresse adresse;
    ArrayList<Block> blockListe;

    public Stadion(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
        this.blockListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Block> getBlockListe() {
        return blockListe;
    }

    @Override
    public String toString() {
         String text ="Stadion\n";
                text+="Name: "+name+"\n";
                text+="Adresse: "+adresse+"\n";
                text+="Blöcke:\n";
        for (Block b:blockListe) {
            text+= b.toString();
        }
        return text;

    }
}
