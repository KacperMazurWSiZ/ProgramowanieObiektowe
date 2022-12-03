public class Prostokat {

    double dlugosc, szerokosc;

    public Prostokat() {
    }

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public double getPole(){
        return dlugosc * szerokosc;
    }

    public double getObwod(){
        return 2*dlugosc + 2*szerokosc;
    }

    public double getPrzekatna(){

        double result = Math.pow(dlugosc, 2) + Math.pow(szerokosc, 2);

        return Math.sqrt(result);
    }

}