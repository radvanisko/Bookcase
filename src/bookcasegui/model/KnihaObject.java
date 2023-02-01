package ulohy.bookcasegui.model;


// priprava objektu KnihaObjekt
public class KnihaObject {
    private String meno;
    private String autor;
    private int rokvydania;
    private double cena;


    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokvydania() {
        return rokvydania;
    }

    public void setRokvydania(int rokvydania) {
        this.rokvydania = rokvydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public KnihaObject() {
    }
}
