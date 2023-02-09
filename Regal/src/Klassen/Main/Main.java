package Klassen.Main;

import Klassen.*;
import Klassen.Exceptions.BehaelterNichtGefundenException;
import Klassen.Mutter.Vererbungen.Kiste;
import Klassen.Mutter.Vererbungen.Tonne;

public class Main {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Lagerweg","2", "Lagerhausen","28279");
        Lagerhalle lagerhalle = new Lagerhalle("CoolesLager",adresse,"1");
        Regal regal = new Regal(lagerhalle);

        Kiste kiste1 = new Kiste("1",15,100,300,100,300);
        Kiste kiste2 = new Kiste("2",20,200,300,100,300);

        Tonne tonne1 = new Tonne("3",15,100,300,100);
        Tonne tonne2 = new Tonne("4",20,100,300,100);

        regal.addBehaelter(kiste1);
        regal.addBehaelter(kiste2);
        regal.addBehaelter(tonne1);
        regal.addBehaelter(tonne2);

        kiste1.setGewichtInhalt(100);
        kiste1.setGewichtInhalt(150);

        tonne1.setGewichtInhalt(50);
        tonne2.setGewichtInhalt(50);

        System.out.println(regal);

        try{
            regal.removeBehaelter(tonne2);
        }catch (BehaelterNichtGefundenException e){
            System.out.println(e.getMessage());
        }

        System.out.println(regal);

        try{
            regal.getBehaelter("4");
        }catch (BehaelterNichtGefundenException e){
            System.out.println(e.getMessage());
        }





    }
}
