package Klassen;


import java.util.Arrays;

public class Block {
    private String name;
    private Sitzplatz[][] sitzplaetze;

    public Block(String name, int anzahlReihen, int anzahlSitze) {
        this.name = name;
        this.sitzplaetze = new Sitzplatz[anzahlReihen][anzahlSitze];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlSitze() {
        return sitzplaetze.length*sitzplaetze[0].length;
    }

    public int getAnzahlReihen() {
        return sitzplaetze.length;
    }

    public int getAnzahlZuschauer() {
        int count = 0;
        for (int i = 0; i < sitzplaetze.length; i++) {
            for (Sitzplatz s : sitzplaetze[i]) {
                if (s != null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getAnzahlZuschauer(Gewaltbereitschaft gewaltbereitschaft)  {
        int count = 0;
        for (int i = 0; i < sitzplaetze.length; i++) {
            for (Sitzplatz s : sitzplaetze[i]) {
                if (s != null && s.getZuschauer().getGewaltbereitschaft() == gewaltbereitschaft) {
                    count++;
                }
            }
        }
        return count;
    }

    public void vergebenSitz(int reihe, int sitz, Zuschauer zuschauer) throws SitzplatzAngabeInvalideException{
        if (sitzplaetze[reihe][sitz] == null) {
            sitzplaetze[reihe][sitz] = new Sitzplatz(this, reihe, sitz, zuschauer);
        }
        else {
            throw new SitzplatzAngabeInvalideException();
        }
    }

    @Override
    public String toString() {

        return "Name: " + name + "\n" +
                "Anzahl Reihen: " + getAnzahlReihen() + "\n" +
                "Anzahl Sitze: " + getAnzahlSitze() + "\n" +
                "Anzahl Zuschauer im Block: " + getAnzahlZuschauer() + "\n";


    }
}
