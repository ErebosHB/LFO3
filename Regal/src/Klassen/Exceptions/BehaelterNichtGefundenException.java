package Klassen.Exceptions;

public class BehaelterNichtGefundenException extends Exception{
    private String behaelterNr;

    public BehaelterNichtGefundenException(String behaelterNr) {
        this.behaelterNr = behaelterNr;
    }

    public String getBehaelterNr() {
        return behaelterNr;
    }

    @Override
    public String getMessage() {
        return "Behälter mit der Nummer: "+behaelterNr+" nicht im Lager gefunden!";
    }
}
