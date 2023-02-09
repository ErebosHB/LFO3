package Klassen.Mutter;

public abstract class Behaelter {
    private String behaelterNr;
    private double gewichtBehaelter;
    private double gewichtInhaltMax;
    private double gewichtInhalt;
    private double hoehe;

    public Behaelter(String behaelterNr, double gewichtBehaelter, double gewichtInhaltMax, double hoehe) {
        this.behaelterNr = behaelterNr;
        this.gewichtBehaelter = gewichtBehaelter;
        this.gewichtInhaltMax = gewichtInhaltMax;
        this.gewichtInhalt = gewichtInhalt;
        this.hoehe = hoehe;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    public double getGewichtBehaelter() {
        return gewichtBehaelter;
    }

    public double getGewichtInhaltMax() {
        return gewichtInhaltMax;
    }

    public double getGewichtInhalt() {
        return gewichtInhalt;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setGewichtBehaelter(double gewichtBehaelter) {
        this.gewichtBehaelter = gewichtBehaelter;
    }

    public void setGewichtInhaltMax(double gewichtInhaltMax) {
        this.gewichtInhaltMax = gewichtInhaltMax;
    }

    public void setGewichtInhalt(double gewichtInhalt) {
        this.gewichtInhalt = gewichtInhalt;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public String toString() {
        return "Behaelter{" +
                "behaelterNr='" + behaelterNr + '\'' +
                ", gewichtBehaelter=" + gewichtBehaelter +
                ", gewichtInhaltMax=" + gewichtInhaltMax +
                ", gewichtInhalt=" + gewichtInhalt +
                ", hoehe=" + hoehe +
                '}';
    }
}
