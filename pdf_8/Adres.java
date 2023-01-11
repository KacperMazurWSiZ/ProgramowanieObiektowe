package PDF08;

class AdresError extends Exception {
    public AdresError(String message) {
        super(message);
    }
}

public class Adres {

    String ulica, kodPocztowy, miasto;
    int nrDomu;


    public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) throws AdresError {

        String error = "";

        if (ulica == null) error += "Ulica nie moze byc NULL";
        if (kodPocztowy == null) error += "Kod pocztowy nie moze byc NULL";
        if (miasto == null) error += "Miasto nie moze byc NULL";
        if (nrDomu <= 0) error += "Numer domu musi byc kuczba > 0";
        if (!error.equals("")) throw new AdresError(error);

        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.nrDomu = nrDomu;
    }
}