package Klassen.Exceptions;

public class LagerhalleNichtVorhandenException extends Exception{
    private String lagerhalleNr;

    public LagerhalleNichtVorhandenException(String lagerhalleNr) {
        this.lagerhalleNr = lagerhalleNr;
    }

    @Override
    public String getMessage() {
        return "Lagerhalle nicht gefunden!";
    }
}
