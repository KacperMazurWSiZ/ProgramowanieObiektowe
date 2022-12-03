public class Podrecznik extends Ksiazka{

    String wydawnictwo, kategoria;
    int cena;

    public Podrecznik(String tytul, String autor, int rokWydania, int isbn, String wydawnictwo, String kategoria, int cena) {
        super(tytul, autor, rokWydania, isbn);
        this.wydawnictwo = wydawnictwo;
        this.kategoria = kategoria;
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
