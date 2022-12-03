import java.util.Objects;

public class Gatunek implements Cloneable{

    String nazwaRodzaju, nazwaGatunkowa, opis;
    int liczbaChromosomow2n, podstawowaLiczbaChromosomow;

    public Gatunek(String nazwaRodzaju, String nazwaGatunkowa, String opis, int liczbaChromosomow2n, int podstawowaLiczbaChromosomow) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.opis = opis;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
    }

    public String getNazwaRodzaju() {
        return nazwaRodzaju;
    }

    public void setNazwaRodzaju(String nazwaRodzaju) {
        this.nazwaRodzaju = nazwaRodzaju;
    }

    public String getNazwaGatunkowa() {
        return nazwaGatunkowa;
    }

    public void setNazwaGatunkowa(String nazwaGatunkowa) {
        this.nazwaGatunkowa = nazwaGatunkowa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getLiczbaChromosomow2n() {
        return liczbaChromosomow2n;
    }

    public void setLiczbaChromosomow2n(int liczbaChromosomow2n) {
        this.liczbaChromosomow2n = liczbaChromosomow2n;
    }

    public int getPodstawowaLiczbaChromosomow() {
        return podstawowaLiczbaChromosomow;
    }

    public void setPodstawowaLiczbaChromosomow(int podstawowaLiczbaChromosomow) {
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
    }

    public String getPelnaNazwa() {
        return nazwaRodzaju + nazwaGatunkowa;
    }

    @Override
    public String toString() {
        return "Gatunek{" +
                "nazwaRodzaju='" + nazwaRodzaju + '\'' +
                ", nazwaGatunkowa='" + nazwaGatunkowa + '\'' +
                ", opis='" + opis + '\'' +
                ", liczbaChromosomow2n=" + liczbaChromosomow2n +
                ", podstawowaLiczbaChromosomow=" + podstawowaLiczbaChromosomow +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
