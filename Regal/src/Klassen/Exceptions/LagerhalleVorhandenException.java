package Klassen.Exceptions;

public class LagerhalleVorhandenException extends Exception{
    private String lagerhalleNr;

    public LagerhalleVorhandenException(String lagerhalleNr) {
        this.lagerhalleNr = lagerhalleNr;
    }

    @Override
    public String getMessage() {
        return "Lagerhalle schon vorhanden!";
    }
}
