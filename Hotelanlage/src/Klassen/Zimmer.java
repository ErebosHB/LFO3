package Klassen;

import Klassen.Exception.GastAlreadyCheckedinException;
import Klassen.Exception.GastNotCheckedinException;

import java.util.ArrayList;

public class Zimmer {

    private int nr;
    private ArrayList<Gast> gastListe;

    public Zimmer(int nr) {
        this.nr = nr;
        this.gastListe = new ArrayList<Gast>();
    }

    public int getNr() {
        return nr;
    }

    public ArrayList<Gast> getGastListe() {
        return gastListe;
    }

    public int getAnzahlGaeste(){
        return gastListe.size();
    }

    public void checkin(Gast gast) throws GastAlreadyCheckedinException {
        if (gastListe.contains(gast)){
            throw new GastAlreadyCheckedinException(gast);
        }
        gastListe.add(gast);
    }

    public void checkout(Gast gast) throws GastNotCheckedinException {
        if (!gastListe.contains(gast)){
            throw new GastNotCheckedinException(gast);
        }
        gastListe.remove(gast);
    }
}
