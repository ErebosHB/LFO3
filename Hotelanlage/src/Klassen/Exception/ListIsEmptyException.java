package Klassen.Exception;

public class ListIsEmptyException extends Exception{
    @Override
    public String getMessage() {
        return "List is empty";
    }
}
