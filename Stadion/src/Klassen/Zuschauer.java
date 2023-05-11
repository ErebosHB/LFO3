package Klassen;

public class Zuschauer extends Person {

    private Adresse adresse;
    private Gewaltbereitschaft gewaltbereitschaft;
    private String ausweisNr;

    public Zuschauer(String name, int alter, String ausweisNr) {
        super(name, alter);
        this.ausweisNr = ausweisNr;
        this.gewaltbereitschaft = Gewaltbereitschaft.FRIEDLICH;
    }

    public Zuschauer(String name, int alter, String ausweisNr, Gewaltbereitschaft gewaltbereitschaft) {
        this(name, alter, ausweisNr);
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Gewaltbereitschaft getGewaltbereitschaft() {
        return gewaltbereitschaft;
    }

    public void setGewaltbereitschaft(Gewaltbereitschaft gewaltbereitschaft) {
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\n"+
                "Alter: "+getAlter()+"\n"+
                "Ausweisnummer: "+ausweisNr+"\n"+
                "Gewaltbereitschaft: "+gewaltbereitschaft+"\n";
    }
}
