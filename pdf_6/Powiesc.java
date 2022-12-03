public class Powiesc extends Ksiazka{

    String opis, gatunek;
    int cena;

    public Powiesc(String tytul, String autor, int rokWydania, int isbn, String opis, String gatunek, int cena) {
        super(tytul, autor, rokWydania, isbn);
        this.opis = opis;
        this.gatunek = gatunek;
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
