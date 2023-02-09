package Klassen;

import Klassen.Adresse;

public class Lagerhalle {
    private String name;
    private Adresse adresse;
    private String lagerhalleNr;

    public Lagerhalle(String name, Adresse adresse,String lagerhalleNr) {
        this.name = name;
        this.adresse = adresse;
        this.lagerhalleNr = lagerhalleNr;
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

    public String getLagerhalleNr() {
        return lagerhalleNr;
    }


    @Override
    public String toString() {
        return "Klassen.Lagerhalle{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
