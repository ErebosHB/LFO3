package Klassen.Main;

import Klassen.*;
import Klassen.DAO.GastDAO;
import Klassen.Exception.GastNichtVorhandenException;
import Klassen.Exception.GastVorhandenException;
import Klassen.Exception.ListIsEmptyException;


public class Main {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Schönhausen", "1", "28279","Hampe");
        Gast olaf = new Gast("Olaf","Scholz",adresse,1);
        Gast max = new Gast("max","Scholz",adresse,2);
        Gast karl = new Gast("karl","Scholz",adresse,3);
        Gast erich = new Gast("erich","Scholz",adresse,4);

        GastDAO gastDAO = GastDAO.getInstance();
        try {
            gastDAO.insert(olaf);
            gastDAO.insert(max);
            gastDAO.insert(karl);
        }catch (GastVorhandenException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        try {
            gastDAO.findById(olaf.getGastNr());
            System.out.println(gastDAO.findById(olaf.getGastNr()).getVorname());
        }catch (GastNichtVorhandenException e){
            e.getMessage();
        }
        System.out.println();
        try {
            for (Gast e: gastDAO.findAll()) {
                System.out.println(e.getVorname() +" "+e.getNachname());
            }
        } catch (ListIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        olaf.setVorname("Olaa");
        try {
            gastDAO.update(olaf);
            for (Gast e: gastDAO.findAll()) {
                System.out.println(e.getVorname() +" "+e.getNachname());
            }
        }catch (GastNichtVorhandenException | ListIsEmptyException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        try {
            gastDAO.delete(karl.getGastNr());
            for (Gast e: gastDAO.findAll()) {
                System.out.println(e.getVorname() +" "+e.getNachname());
            }
        }catch (GastNichtVorhandenException | ListIsEmptyException e){
            System.out.println(e.getMessage());
        }


        Zimmer zimmer1 = new Zimmer(1);
        Zimmer zimmer2 = new Zimmer(2);
        Zimmer zimmer3 = new Zimmer(3);
        Zimmer zimmer4 = new Zimmer(4);
        Zimmer zimmer5 = new Zimmer(5);
        Zimmer zimmer6 = new Zimmer(6);
        Zimmer zimmer7 = new Zimmer(7);
        Zimmer zimmer8 = new Zimmer(8);

        Etage etage1GE1 = new Etage("E1");
        etage1GE1.getZimmerListe().add(zimmer1);

        Etage etage2GE1 = new Etage("E2");
        etage2GE1.getZimmerListe().add(zimmer2);

        Etage etage3GE1 = new Etage("E3");
        etage3GE1.getZimmerListe().add(zimmer3);
        etage1GE1.getZimmerListe().add(zimmer6);

        Etage etage1GE2 = new Etage("E1");
        etage1GE2.getZimmerListe().add(zimmer4);
        etage1GE1.getZimmerListe().add(zimmer7);

        Etage etage2GE2 = new Etage("E2");
        etage2GE2.getZimmerListe().add(zimmer5);
        etage1GE1.getZimmerListe().add(zimmer8);



        Gebaeude gebaeude1 = new Gebaeude("G1");
        gebaeude1.getEtagenListe().add(etage1GE1);
        gebaeude1.getEtagenListe().add(etage2GE1);
        gebaeude1.getEtagenListe().add(etage3GE1);

        Gebaeude gebaeude2 = new Gebaeude("G2");
        gebaeude2.getEtagenListe().add(etage1GE2);
        gebaeude2.getEtagenListe().add(etage2GE2);

        Hotelanlage hotelanlage = new Hotelanlage("Resort", adresse);
        hotelanlage.getHausListe().add(gebaeude1);
        hotelanlage.getHausListe().add(gebaeude2);


        //Checkin
//        try {
//            zimmer1.checkin(olaf);
//            zimmer1.checkin(olaf);
//            zimmer4.checkin(karl);
//            zimmer7.checkin(max);
//            zimmer5.checkin(erich);
//        }catch (GastAlreadyCheckedinException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(hotelanlage);
    }


}
