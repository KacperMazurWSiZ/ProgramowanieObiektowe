public class Ksiegarnia {

    String nazwa, adres;
    Ksiazka ksiazka;
    Klient klient1;
    int numerTelefonu;

    public Ksiegarnia(String nazwa, String adres, Ksiazka ksiazka, Klient klient1, int numerTelefonu) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.ksiazka = ksiazka;
        this.klient1 = klient1;
        this.numerTelefonu = numerTelefonu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }
}
