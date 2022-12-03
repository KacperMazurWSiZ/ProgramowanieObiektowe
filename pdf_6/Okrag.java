public class Okrag extends Figura{

    public  Punkt srodek = new Punkt(3,3);
    public double promien;


    public Okrag(Punkt punkt, double promien) {
        super(punkt);
        this.promien = promien;
    }

    public  Okrag(){
        srodek.x = 0;
        srodek.y = 0;
        promien = 0;
    }

    public double getPow(){
        return Math.PI*Math.pow(promien,2);
    }

    public double srednica(){
        return 2*promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void wSrodku(Punkt p){
        double lewaStrona = Math.pow((srodek.x - p.x),2) + Math.pow((srodek.y - p.y),2);
        double prawaStrona = Math.pow(promien,2);

        if(lewaStrona<=prawaStrona){
            System.out.println("pkt." + p.x + " , " + p.y + " znajduje sie wewnatrz okregu");
        }
        else System.out.println("Punkt lezy poza okregiem");
    }

    String opis(){
        return "Klasa Okrag Srodek: " + srodek.opis() + " Promien: " + promien;
    }

}