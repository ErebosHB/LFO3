package Klassen.Exception;

import Klassen.Gast;

public class GastNotCheckedinException extends Exception{

    private Gast gast;

    public GastNotCheckedinException(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        return gast.getNachname() +"hat noch nicht eingechecked!";
    }
}
