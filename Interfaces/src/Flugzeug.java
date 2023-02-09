public class Flugzeug extends farbbes implements Fluggeraet, Fahrzeug{

    public Flugzeug(String farbe) {
        super(farbe);
    }

    @Override
    public void bremsen() {
        System.out.println("Fahr dich runter");
    }

    @Override
    public void fahren() {
        System.out.println("Fahr dich hoch");
    }

    @Override
    public void fliegen() {
        System.out.println("Fahr weiter!");
    }

    @Override
    public void landen() {
        System.out.println("Ich muss raus!");
    }
}
