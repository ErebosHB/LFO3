package Klassen;

import java.util.ArrayList;

public class Etage {

    private String name;
    private ArrayList<Zimmer> zimmerListe;

    public Etage(String name) {
        this.name = name;
        this.zimmerListe = new ArrayList<Zimmer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public int getAnzahlZimmer(){
        return zimmerListe.size();
    }

    public int getAnzahlZimmerFrei(){
        int frei = 0;
        for (Zimmer z:getZimmerListe()) {
            if (z.getGastListe().isEmpty()){
                frei++;
            }
        }
        return frei;
    }

    public int getAnzahlGaeste(){
        int gaeste = 0;
        for (Zimmer z: getZimmerListe()) {
            gaeste += z.getGastListe().size();
        }
        return gaeste;
    }

    @Override
    public String toString() {
        return "\n\t\tEtage: "+getName() +
                ", Zimmer: "+getAnzahlZimmer()+
                ", Zimmer frei: "+getAnzahlZimmerFrei() +
                ", Gäste: "+getAnzahlGaeste();
    }
}
