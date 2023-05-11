package Klassen.Main;

import Klassen.*;

public class Test {
    public static void main(String[] args){
        Zuschauer zuschauer1 = new Zuschauer("Lisa Müller", 30, "987654321");
        Zuschauer zuschauer2= new Zuschauer("Holgert",29,"38754954",Gewaltbereitschaft.GEWALTBEREIT);

        Block block = new Block("Block a",15,15);

        Sitzplatz sitzplatz1= new Sitzplatz(block,3,4,zuschauer1);
        Sitzplatz sitzplatz2= new Sitzplatz(block,1,4,zuschauer2);

        Adresse adresse = new Adresse("Schönhausen", "1", "28279","Hampe");
        try {
            block.vergebenSitz(3,4,zuschauer1);
        } catch (SitzplatzAngabeInvalideException e) {
            System.out.println(e.getMessage());
        }
        try {
            block.vergebenSitz(3,4,zuschauer2);
        } catch (SitzplatzAngabeInvalideException e) {
            System.out.println(e.getMessage());
        }
        Stadion stadion = new Stadion("Wesre",adresse);
        stadion.getBlockListe().add(block);

        System.out.println(stadion);

        System.out.println(block.getAnzahlZuschauer(Gewaltbereitschaft.GEWALTBEREIT));

        System.out.println(sitzplatz1 +"" +sitzplatz2);






    }
}
