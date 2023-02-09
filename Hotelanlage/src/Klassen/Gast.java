package Klassen;

public class Gast extends Person{
    private Adresse adresse;
    private int gastNr;

    public int getGastNr() {
        return gastNr;
    }

    public Gast(String vorname, String nachname, Adresse adresse, int gastNr) {
        super(vorname, nachname);
        this.adresse = adresse;
        this.gastNr = gastNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }
}
