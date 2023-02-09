package Klassen.Exception;

public class GastVorhandenException extends Exception{

    @Override
    public String getMessage() {
        return "Gast schon in der Liste Vorhanden";
    }
}
