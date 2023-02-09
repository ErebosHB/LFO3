package Klassen;

import java.util.ArrayList;

public class Hotelanlage {

    private String name;
    private Adresse adresse;
    private ArrayList<Gebaeude> gebaeudeListe;

    public Hotelanlage(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
        this.gebaeudeListe = new ArrayList<Gebaeude>();
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

    public ArrayList<Gebaeude> getHausListe(){
        return gebaeudeListe;
    }

    public int getAnzahlGebaeude(){
        return gebaeudeListe.size();
    }

    public int getAnzahlZimmer(){
        int zimmer = 0;
        for (Gebaeude g:getHausListe()) {
            zimmer += g.getAnzahlZimmer();
        }
        return zimmer;
    }

    public int getAnzahlZimmerFrei(){
        int frei = 0;
        for (Gebaeude g:getHausListe()) {
            frei += g.getAnzahlZimmerFrei();
        }
        return frei;
    }

    public int getAnzahlGaeste(){
        int gaeste = 0;
        for (Gebaeude g: getHausListe()) {
            gaeste += g.getAnzahlGaeste();
        }
        return gaeste;
    }

    @Override
    public String toString() {
        String text = "Hotelanlage: "+getName();
        text += "\nAdresse: "+getAdresse();
        for (Gebaeude g:getHausListe()) {
            text+= g.toString();
        }
        text += "\ngesamt: Zimmer: "+getAnzahlZimmer();
        text += ", Zimmer frei: "+getAnzahlZimmerFrei();
        text += ", Gäste: "+getAnzahlGaeste();
        return text;
    }
}
