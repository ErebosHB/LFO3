package Klassen.Main;

import Klassen.Adresse;
import Klassen.Exceptions.LagerhalleNichtVorhandenException;
import Klassen.Exceptions.LagerhalleVorhandenException;
import Klassen.Lagerhalle;
import Klassen.DAO.LagerhalleDAO;


public class Test {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Lagerweg", "2", "Lagerhausen", "28279");
        Lagerhalle lagerhalle = new Lagerhalle("Coole Lagerhalle", adresse, "1");

        LagerhalleDAO l = new LagerhalleDAO();

        System.out.println(l.findAll().size());

        try {
            l.insert(lagerhalle);
        } catch (LagerhalleVorhandenException e) {
            System.out.println(e.getMessage());
        }

        try {
            l.findById("3");
        } catch (LagerhalleNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(l.findAll().size());

        try {
            System.out.println(l.findById(lagerhalle.getLagerhalleNr()).getName());
        } catch (LagerhalleNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
    }
}
