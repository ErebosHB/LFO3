package Klassen;

public class Adresse {
    private String strasse;
    private String hausNr;
    private String ort;
    private String plz;

    public Adresse(String strasse, String hausNr, String ort, String plz) {
        this.strasse = strasse;
        this.hausNr = hausNr;
        this.ort = ort;
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausNr='" + hausNr + '\'' +
                ", ort='" + ort + '\'' +
                ", plz='" + plz + '\'' +
                '}';
    }
}
