public class Main {
    public static void main(String[] args) {
        Prostokat p1 = new Prostokat(2, 4);
        Trojkat t1 = new Trojkat(5, 2.5);
        Figura f1 = new Figura();
        Okrag o1 = new Okrag(new Punkt(3, 4), 10);

        System.out.println("Pole prostokata:" + p1.getPowierzchnia());
        System.out.println(f1.opis());
        o1.wSrodku(new Punkt(5, 7));

        p1.przesun(3,5);

        Kwadrat k1 = new Kwadrat(10,10);

        System.out.println("Szerokosc: " + k1.getSzer());

        System.out.println(p1.opis());
        System.out.println(t1.opis());
        System.out.println(f1.opis());
        System.out.println(o1.opis());

        Samochod s1 = new Samochod("audi","a4","sedan","czarne",2007,30000);
        Samochod s2 = new Samochod();
        SamochodOsobowy so1 = new SamochodOsobowy("Skoda","Octavia","limuzyna","czerwony",2010,50000,3.2,1.5,4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(so1.toString());
    }
}