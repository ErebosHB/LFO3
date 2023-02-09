package Klassen.Exception;

public class GastNichtVorhandenException extends Exception{

    @Override
    public String getMessage() {
        return "Gast nicht in der Liste eingetragen";
    }
}
