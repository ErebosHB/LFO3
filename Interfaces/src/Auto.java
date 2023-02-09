public class Auto extends farbbes implements Fahrzeug{

    public Auto(String farbe){
        super(farbe);
    }

    @Override
    public void fahren() {
        System.out.println("Brumm, brumm");
    }

    @Override
    public void bremsen() {
        System.out.println("quietsch");
    }
}
