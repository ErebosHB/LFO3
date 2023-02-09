package Klassen.Exception;

import Klassen.Gast;

public class GastAlreadyCheckedinException extends Exception{

    private Gast gast;

    public GastAlreadyCheckedinException(Gast gast) {
        this.gast = gast;
    }

    @Override
    public String getMessage() {
        return gast.getNachname()+ " ist schon eingechecked!";
    }
}
