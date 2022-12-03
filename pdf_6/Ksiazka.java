public class Ksiazka {

    String tytul, autor;
    int rokWydania, isbn;

    public Ksiazka(String tytul, String autor, int rokWydania, int isbn) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.isbn = isbn;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
