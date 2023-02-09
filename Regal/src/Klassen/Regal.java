package Klassen;

import Klassen.Exceptions.BehaelterNichtGefundenException;
import Klassen.Mutter.Behaelter;

import java.util.ArrayList;
import java.util.Objects;

public class Regal {
    private Lagerhalle lagerhalle;
    private ArrayList<Behaelter> behaelterliste;

    public Regal(Lagerhalle lagerhalle) {
        this.lagerhalle = lagerhalle;
        this.behaelterliste = new ArrayList<>();
    }

    public Lagerhalle getLagerhalle() {
        return lagerhalle;
    }

    public void addBehaelter(Behaelter behaelter){
        behaelterliste.add(behaelter);
    }

    public void removeBehaelter(Behaelter behaelter) throws BehaelterNichtGefundenException {
        if (!behaelterliste.contains(behaelter)){
            throw new BehaelterNichtGefundenException(behaelter.getBehaelterNr());
        }
        behaelterliste.remove(behaelter);
    }
    public Behaelter getBehaelter(String behaelterNr) throws BehaelterNichtGefundenException {
        for (Behaelter b: behaelterliste) {
            if (Objects.equals(b.getBehaelterNr(), behaelterNr)){
                return b;
            }
        }
        throw new BehaelterNichtGefundenException(behaelterNr);
    }

    public int getAnzahlBehaelter(){
        return behaelterliste.size();
    }

    public double getGewichtGesamt(){
        double count = 0;
        for (Behaelter b:behaelterliste) {
            count += b.getGewichtBehaelter() + b.getGewichtInhalt();
        }
        return count;
    }

    @Override
    public String toString() {
        return "Regal{" +
                "lagerhalle=" + lagerhalle +
                ", behaelterliste=" + behaelterliste +
                '}';
    }
}
