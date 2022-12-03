import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Prostokat p1 = new Prostokat(3,4);

        System.out.println("Dlugosc: " + p1.getDlugosc());
        System.out.println("Obwod: " + p1.getObwod());
        System.out.println("Obwod: " +p1.getSzerokosc());
        System.out.println("Przekatna: " +p1.getPrzekatna());

        Budynek b1 = new Budynek("wsiz", 2, LocalDate.of(1988,1,1));
        Budynek b2 = new Budynek("kielnarowa", 4, LocalDate.of(1928,1,1));

        b1.info();
        b2.info();

        Gatunek g1 = new Gatunek("Lipa", "Drzewo","Lorem ipsum", 20, 10);
        Gatunek g2 = (Gatunek) g1.clone();

        g1.setNazwaGatunkowa("Drzewo lisciaste");
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        g2.setOpis("Drzewo impsum");
        System.out.println(g2.toString());

        System.out.println("Adres obiektu g1: " + g1.hashCode());
        System.out.println("Adres obiektu g2: " + g2.hashCode());




    }
}