public class SamochodOsobowy extends Samochod{

    double waga, pojemnoscSilnika;
    int iloscMiejsc;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg, double waga, double pojemnoscSilnika, int iloscMiejsc) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        setPojemnoscSilnika(pojemnoscSilnika);
        setIloscMiejsc(iloscMiejsc);
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        if(waga < 2){
            this.waga = 2;
        }
         else if (waga>4.5) {
            this.waga = 4.5;
        }
         else {
            this.waga = waga;
        }

    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        if(pojemnoscSilnika < 0.8){
            this.pojemnoscSilnika = 0.8;
        }
        else if (pojemnoscSilnika>2.0) {
            this.pojemnoscSilnika = 4.5;
        }
        else {
            this.pojemnoscSilnika = pojemnoscSilnika;
        }
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        if(iloscMiejsc<0){
            this.iloscMiejsc = 1;
        }
        else{
            this.iloscMiejsc = iloscMiejsc;
        }
    }

    @Override
    public String toString() {
        return "SamochodOsobowy{" +
                "waga=" + waga +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", iloscMiejsc=" + iloscMiejsc +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + nadwozie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", przebieg=" + przebieg +
                '}';
    }
}
