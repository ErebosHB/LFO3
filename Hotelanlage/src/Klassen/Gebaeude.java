package Klassen;

import java.util.ArrayList;

public class Gebaeude {

    private String name;
    private ArrayList<Etage> etagenListe;

    public Gebaeude(String name) {
        this.name = name;
        this.etagenListe = new ArrayList<Etage>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }

    public int getAnzahlEtagen(){
        return etagenListe.size();
    }

    public int getAnzahlZimmer(){
        int zimmer = 0;
        for (Etage e:getEtagenListe()) {
            zimmer += e.getAnzahlZimmer();
        }
        return zimmer;
    }

    public int getAnzahlZimmerFrei(){
        int frei = 0;
        for (Etage e: getEtagenListe()) {
            frei += e.getAnzahlZimmerFrei();
        }
        return frei;
    }

    public int getAnzahlGaeste(){
        int gaeste = 0;
        for (Etage e: getEtagenListe()) {
            gaeste += e.getAnzahlGaeste();
        }
        return gaeste;
    }

    @Override
    public String toString() {
        String text = "\n\tGebäude: "+getName();
        for (Etage e: getEtagenListe()) {
            text += e.toString();
        }
        text += "\n\t\tgesamt: , "+getAnzahlZimmer()+", Zimmer frei: "+getAnzahlZimmerFrei()+", Gäste: "+getAnzahlGaeste();
        return text;

    }
}
