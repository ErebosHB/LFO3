public class Programm {
    public static void main(String[] args) {

        Fahrzeug f1 = new Flugzeug("weiß");
        Fahrzeug f2 = new Auto("blau");

        ((Fluggeraet)f1).fliegen();

    }
}
